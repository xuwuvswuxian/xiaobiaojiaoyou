package com.dfbz_wzy.sys.service;

import com.dfbz_wzy.sys.entity.Page;
import com.dfbz_wzy.sys.entity.User;

import java.util.List;

/**
 * @author wzy
 * @company 东方标准
 * @date 2019/12/2 17:13
 * @description 用户接口
 */
public interface UserService {

    List<User> userList(String account, Page page);

    Integer getCount(String account);

    void addUser(User user);

    void delUserById(Integer id);
}
