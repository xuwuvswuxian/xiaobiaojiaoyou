package com.dfbz_wzy.sys.service.impl;

import com.dfbz_wzy.sys.dao.UserDao;
import com.dfbz_wzy.sys.entity.Page;
import com.dfbz_wzy.sys.entity.User;
import com.dfbz_wzy.sys.service.UserService;
import com.dfbz_wzy.utils.DateUtil;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 17:14
 * @description 用户服务类描述
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDao();

    /**
     *@decription 根据查询条件进行分页显示
     *@author wzy
     *@date 2019/12/2 18:27
     *@params [account]
     *@return java.lang.Integer
     */
    @Override
    public List<User> userList(String account, Page page) {
        return userDao.userList(account,page);
    }

    /**
    *@decription 带条件查询总记录数
    *@author wzy
    *@date 2019/12/2 18:27
    *@params [account]
    *@return java.lang.Integer
    */
    @Override
    public Integer getCount(String account) {
        return userDao.getCount(account);
    }

    /**
    *@decription 添加用户
    *@author wzy
    *@date 2019/12/2 19:14
    *@params [user]
    *@return void
    */
    @Override
    public void addUser(User user) {
        user.setCreateTime(DateUtil.getDateStr());
        userDao.addUser(user);
    }

    /**
    *@decription 通过id删除用户
    *@author wzy
    *@date 2019/12/2 20:30
    *@params [id]
    *@return void
    */
    @Override
    public void delUserById(Integer id) {
        userDao.delUserById(id);
    }
}
