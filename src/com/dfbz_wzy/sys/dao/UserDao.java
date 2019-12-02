package com.dfbz_wzy.sys.dao;

import com.dfbz_wzy.sys.entity.Page;
import com.dfbz_wzy.sys.entity.User;
import com.dfbz_wzy.utils.DBUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 11:30
 * @description 用户类连接数据库描述
 */
public class UserDao {

    private JdbcTemplate template = new JdbcTemplate(DBUtil.getDataSource());

    public List<User> userList(String account, Page page){
        String sql = "SELECT " +
                "d.NAME deptName," +
                "u.id id," +
                "u.account account," +
                "u.NAME name," +
                "u.age age," +
                "u.sex sex," +
                "u.birth_date birthDate," +
                "u.create_time createTime " +
                "FROM " +
                "sys_user u " +
                "LEFT JOIN sys_dept d ON u.dept_id = d.id "+
                "where u.account like ? limit ?,?";
        return template.query(sql,new BeanPropertyRowMapper<>(User.class),"%"+account+"%",
                ((page.getPageCurrent()-1)*page.getPageSize()),page.getPageSize());
    }

    public Integer getCount(String account){
        String sql = "select count(*) from sys_user where account like ?";
        return template.queryForObject(sql,Integer.class,"%"+account+"%");
    }

    public void addUser(User u){
        String sql = "insert into sys_user values (?,?,?,?,?,?,?,?,?,?,?,?)";
        template.update(sql, u.getId(),u.getDeptId(), u.getAccount(), u.getPassword(), u.getName(),
                u.getAge(), u.getSex(), u.getEmail(), u.getBirthDate(), u.getCreateTime(),
                u.getCreateBy(),u.getDelFlag());
    }

    public void delUserById(Integer id){
        String sql = "delete from sys_user where id = ?";
        template.update(sql,id);
    }

    public void updateUserById(Integer id,User u){
        String sql = "update sys_user set account=? where id = ?";
        template.update(sql,u.getAccount(),id);
    }

}
