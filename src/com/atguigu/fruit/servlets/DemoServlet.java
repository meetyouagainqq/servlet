package com.atguigu.fruit.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月28日 19:37
 * @description 演示servlet的生命周期
 */
//servlet在线程中为单例的，不安全的
public class DemoServlet extends HttpServlet {
    //tomcat通过反射完成实例化
    public DemoServlet() {
        System.out.println("正在实例化...");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("正在初始化...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("正在服务...");
    }

    @Override
    public void destroy() {
        //  默认情况下随着容器销毁
        System.out.println("正在销毁...");
    }
}
