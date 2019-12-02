package com.dfbz_wzy.sys.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wzy
 * @version 1.0.1
 * @company 东方标准
 * @date 2019/12/2 10:54
 * @description Servlet父类描述
 */
public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //通过请求的具体路径进行截取，并获取最后一个数组，这个数组的内容就是接下来调用的方法名
        String uri = request.getRequestURI();
        String[] uriStr = uri.split("/");
        uri = uriStr[uriStr.length-1];

        //利用子类的特性，谁传递过来，此时this指定就是传递过来的对象
        Class clazz = this.getClass();
        try {
            //指定要调用的方法(方法名，后面都是调用这个方法的所需要的形式参数，不写就是没有参数)
            Method method = clazz.getDeclaredMethod(uri,HttpServletRequest.class,HttpServletResponse.class);
            method.setAccessible(true);  //以防万一，暴力反射所有修饰符的方法
            //调用的方法需要传递对象，此时的对象就是传递过来的this对象
            method.invoke(this,request,response);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }

}
