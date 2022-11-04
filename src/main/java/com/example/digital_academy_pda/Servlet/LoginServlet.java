package com.example.digital_academy_pda.Servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // retun to login page
        request.getRequestDispatcher("login.jsp").forward(request, response);
        response.getWriter().println("Hello from LoginServlet");
        // do get logic here
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // gettting the username and password from the login page
        String username = request.getParameter("email");
        String password = request.getParameter("password");
        // print the username and password
        // check if the username and password is empty
        if (username.isEmpty() || password.isEmpty()) {
            // if the username or password is empty
            // return to login page
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            // if the username and password is not empty
            // check if the username and password is correct
            if (username.equals("admin") && password.equals("admin")) {
                // if the username and password is correct
                // return to home page
                request.getRequestDispatcher("home.jsp").forward(request, response);
            } else {
                // if the username and password is not correct
                // return to login page
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
        response.getWriter().println("Username: " + username + " Password: " + password);
    }
}
