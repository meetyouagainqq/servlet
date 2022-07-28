package com.atguigu.fruit.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月28日 21:21
 * @description 演示session
 */
public class Demo1Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session，如果获取不到,创建一个新的
        HttpSession session = req.getSession();
        System.out.println("session Id:"+session.getId());
    }
}
