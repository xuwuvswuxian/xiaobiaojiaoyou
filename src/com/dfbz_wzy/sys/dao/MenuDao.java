package com.dfbz_wzy.sys.dao;

import com.dfbz_wzy.sys.entity.Menu;
import com.dfbz_wzy.utils.DBUtil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author admin
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/11/29 15:02
 * @description 菜单类链接数据库
 */
public class MenuDao {

    private JdbcTemplate template = new JdbcTemplate(DBUtil.getDataSource());

    public List<Menu> listAll() {
        //物理删除，逻辑删除  del_flag
        String sql = "select * from sys_menu order by order_by";
        return template.query(sql, new BeanPropertyRowMapper<>(Menu.class));
    }

}
