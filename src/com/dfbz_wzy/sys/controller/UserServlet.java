package com.dfbz_wzy.sys.controller;

import com.dfbz_wzy.sys.entity.Page;
import com.dfbz_wzy.sys.entity.User;
import com.dfbz_wzy.sys.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 10:53
 * @description 用户控制类描述
 */
@WebServlet("/sys/user/*")
public class UserServlet extends BaseServlet {

    private UserServiceImpl userService = new UserServiceImpl();

    public void userList(HttpServletRequest request, HttpServletResponse response) {
        Page page = new Page();

        String account = request.getParameter("account");
        account = account == null ? "" : account;
        page.setCount(userService.getCount(account));

        String page1 = request.getParameter("page");
        Integer pageCurrent = page1 == null ? 1 : Integer.valueOf(page1);
        page.setPageCurrent(pageCurrent);

        List<User> list = userService.userList(account, page);
        request.setAttribute("list", list);
        request.setAttribute("account",account);
        request.setAttribute("page",page);
        try {
            request.getRequestDispatcher("/view/sys/user/list.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addUser(HttpServletRequest request, HttpServletResponse response){
        User user = new User();
        Map<String, String[]> map = request.getParameterMap();
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        userService.addUser(user);
        try {
            response.sendRedirect("/sys/user/userList");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delUserById(HttpServletRequest request, HttpServletResponse response){
        String id = request.getParameter("id");
        userService.delUserById(Integer.valueOf(id));
        try {
            response.sendRedirect("/sys/user/userList");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
