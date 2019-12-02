package com.dfbz_wzy.sys.controller;

import com.alibaba.fastjson.JSON;
import com.dfbz_wzy.sys.entity.Dept;
import com.dfbz_wzy.sys.service.impl.DeptServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 11:21
 * @description 部门控制类描述
 */
@WebServlet("/sys/dept/*")
public class DeptServlet extends BaseServlet{

    private DeptServiceImpl deptService = new DeptServiceImpl();

    public void deptList(HttpServletRequest request, HttpServletResponse response){

    }

    public void deptNames(HttpServletRequest request, HttpServletResponse response){
        List<Dept> depts = deptService.deptList();
        try {
            PrintWriter out = response.getWriter();
            String names = JSON.toJSONString(depts);
            out.append(names);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
