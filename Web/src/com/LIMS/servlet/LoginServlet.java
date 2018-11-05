package com.LIMS.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.LIMS.bean.UserBean  ;
import com.LIMS.Model.User ;


@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String method = request.getParameter("method");
        if("login".equals(method)){//登录
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if(username==null||"".equals(username.trim())||password==null||"".equals(password.trim())){
                response.setContentType("text/html;charset=utf-8");
                PrintWriter pw=response.getWriter();
                pw.write("<script language='javascript'>alert('用户名或密码不能为空!');window.location.href='index.jsp';</script>");
//                response.sendRedirect("index.jsp");
                return;
            }
            UserBean userBean = new UserBean();
            boolean isValid = userBean.valid(username,password);
            if(isValid){
                response.setContentType("text/html;charset=utf-8");
                PrintWriter pw=response.getWriter();
                pw.write("<script language='javascript'>alert('登录成功！');window.location.href='welcome.jsp';</script>");
                request.getSession().setAttribute("username", username);
                return;
            }else{
                response.setContentType("text/html;charset=utf-8");
                PrintWriter pw=response.getWriter();
                pw.write("<script language='javascript'>alert('用户名或密码错误，登录失败！');window.location.href='index.jsp';</script>");
                return;
            }
        }else if("logout".equals(method)){//退出登录
            response.setContentType("text/html;charset=utf-8");
            PrintWriter pw=response.getWriter();
            pw.write("<script language='javascript'>alert('退出登录！');window.location.href='index.jsp';</script>");
            request.getSession().removeAttribute("username");
            return;
        }else if("register".equals(method)){//注册
            String username = request.getParameter("username");
            String password1 = request.getParameter("password1");
            String password2 = request.getParameter("password2");
            String email = request.getParameter("email");
            if(username==null||"".equals(username.trim())||password1==null||"".equals(password1.trim())||password2==null||"".equals(password2.trim())||!password1.equals(password2)){
                response.setContentType("text/html;charset=utf-8");
                PrintWriter pw=response.getWriter();
                pw.write("<script language='javascript'>alert('用户名或密码不能为空！');window.location.href='register.jsp';</script>");
                return;
            }
            UserBean userBean = new UserBean();
            boolean isExit = userBean.isExist(username);
            if(!isExit){
                userBean.add(username, password1, email);
                response.setContentType("text/html;charset=utf-8");
                PrintWriter pw=response.getWriter();
                pw.write("<script language='javascript'>alert('注册成功，请登录！');window.location.href='index.jsp';</script>");
                return;
            }else{
                response.setContentType("text/html;charset=utf-8");
                PrintWriter pw=response.getWriter();
                pw.write("<script language='javascript'>alert('用户名已存在！');window.location.href='register.jsp';</script>");
                return;
            }
        }

    }

}
