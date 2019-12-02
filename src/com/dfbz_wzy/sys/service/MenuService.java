package com.dfbz_wzy.sys.service;

import com.dfbz_wzy.sys.entity.Menu;

import java.util.List;

/**
 * @author wzy
 * @company 东方标准
 * @date 2019/11/29 16:39
 * @description 菜单接口
 */
public interface MenuService {

    List<Menu> listAll();
}
