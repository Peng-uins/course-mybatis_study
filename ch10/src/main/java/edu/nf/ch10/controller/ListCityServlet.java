package edu.nf.ch10.controller;

import com.github.pagehelper.PageInfo;
import com.google.gson.Gson;
import edu.nf.ch10.entity.City;
import edu.nf.ch10.service.CitySercice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/list_city")
public class ListCityServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer pageNum = Integer.parseInt(req.getParameter("pageNum"));
        Integer pageSize = Integer.parseInt(req.getParameter("pageSize"));
        //创建业务层
        CitySercice sercice = new CitySercice();
        //查询并返回PageInfo对象
        PageInfo<City> pageInfo = sercice.listCity(pageNum,pageSize);
        //将pageInfo对象序列化为json字符串
        String json = new Gson().toJson(pageInfo);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }

}
