package com.dfbz_wzy.sys.service.impl;

import com.dfbz_wzy.sys.dao.MenuDao;
import com.dfbz_wzy.sys.entity.Menu;
import com.dfbz_wzy.sys.service.MenuService;

import java.util.List;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/11/29 15:55
 * @description 菜单服务类描述
 */
public class MenuServiceImpl implements MenuService {

    private MenuDao menuDao = new MenuDao();

    /**
    *@decription 获取菜单全部集合
    *@author wzy
    *@date 2019/11/29 18:19
    *@params []
    *@return java.util.List<com.dfbz_wzy.sys.entity.Menu>
    */
    @Override
    public List<Menu> listAll() {
        return menuDao.listAll();
    }
}
