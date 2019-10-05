package com.web.entity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author cyq-xn
 * @ClassName LogoutServlet
 * @Description TODO
 * @Date 2019/10/4
 * @Version 1.0
 **/
@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    protected void daGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException, IOException{
        HttpSession session=req.getSession();
        session.invalidate();
        resp.sendRedirect("/index");
    }
}
