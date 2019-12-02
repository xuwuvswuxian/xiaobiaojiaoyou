package com.dfbz_wzy.sys.dao;

import com.dfbz_wzy.sys.entity.Dept;
import com.dfbz_wzy.utils.DBUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 19:39
 * @description 部门连接数据库类描述
 */
public class DeptDao {

    private JdbcTemplate template = new JdbcTemplate(DBUtil.getDataSource());

    public List<Dept> deptList(){
        String sql = "select * from sys_dept";
        return template.query(sql,new BeanPropertyRowMapper<>(Dept.class));
    }
}
