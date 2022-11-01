package com.example.digital_academy_pda.Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // do get logic here
        response.getWriter().println("Hello from LoginServlet");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // login
        String login = request.getParameter("login");
        // password
        String password = request.getParameter("password");
        // check if login and password are correct
        if (login.equals("admin") && password.equals("admin")) {
            // redirect to the home page
            response.sendRedirect("home.jsp");
        } else {
            // redirect to the login page
            response.sendRedirect("login.jsp");
        }
    }
}
