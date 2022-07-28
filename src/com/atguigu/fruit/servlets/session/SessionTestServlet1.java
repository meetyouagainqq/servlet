package com.atguigu.fruit.servlets.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月28日 22:19
 * @description 从session中取数据
 */
public class SessionTestServlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Object uname = session.getAttribute("uname");
        System.out.println("uname="+uname);
    }
}
