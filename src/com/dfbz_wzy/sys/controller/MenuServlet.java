package com.dfbz_wzy.sys.controller;

import com.alibaba.fastjson.JSON;
import com.dfbz_wzy.sys.entity.Menu;
import com.dfbz_wzy.sys.service.impl.MenuServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.event.MenuEvent;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/11/29 15:56
 * @description 菜单控制类描述
 */
@WebServlet("/sys/menu")
public class MenuServlet extends HttpServlet {

    private MenuServiceImpl menuService = new MenuServiceImpl();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询出所有的分类
        List<Menu> list = menuService.listAll();

        /**  原始过滤for+if
         for (Menu menu : list) {
         if (menu.getType().equals("1")) {
         first.add(menu);
         continue;
         }
         if(menu.getType().equals("2")){
         second.add(menu);
         }
         }
         */
        //使用lamdba表达式过滤(通过流的方式调用过滤器的方法，再利用collect的方法把流转化为List对象),过滤出每层菜单的集合
        List<Menu> first = list.stream().filter(menu -> menu.getType().equals("1")).collect(Collectors.toList());
        List<Menu> second = list.stream().filter(menu -> menu.getType().equals("2")).collect(Collectors.toList());
        List<Menu> third = list.stream().filter(menu -> menu.getType().equals("3")).collect(Collectors.toList());

        Map<String,List<Menu>> map = new HashMap<>();
        map.put("first",first);
        map.put("second",second);
        map.put("third",third);

        String menuList = JSON.toJSONString(map);
        PrintWriter out = response.getWriter();
        out.append(menuList);
    }
}
