package com.atguigu.fruit.servlets;

import com.atguigu.fruit.dao.FruitDao;
import com.atguigu.fruit.dao.impl.FruitDaoImpl;
import com.atguigu.fruit.entity.Fruit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author sunshine
 * @version 1.0
 * @date 2022年07月27日 21:34
 * @description
 */
public class AddServlet extends HttpServlet {
    //    相应post请求
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // servlet post方式需设置编码防止乱码,设置编码放在获取参数之前
        //get方式无需设置
        req.setCharacterEncoding("UTF-8");
        String fname = req.getParameter("fname");
        String price = req.getParameter("price");
        int priceValue = Integer.parseInt(price);
        String count = req.getParameter("count");
        int countValue = Integer.parseInt(count);
        String remark = req.getParameter("remark");
        FruitDao fruitDao=new FruitDaoImpl();
        boolean result = fruitDao.insertFruit(new Fruit(0, fname, priceValue, countValue, remark));
        System.out.println(result?"添加成功":"添加失败");
    }
}
