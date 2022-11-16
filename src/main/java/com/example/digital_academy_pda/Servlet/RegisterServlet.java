package com.example.digital_academy_pda.Servlet;

import com.example.digital_academy_pda.Entities.Administrateur;
import com.example.digital_academy_pda.services.AdministrateurService;
import com.example.digital_academy_pda.services.Implimentation.AdministrateurServiceImplomentation;
import com.example.digital_academy_pda.services.Implimentation.UserServiceImplomentation;
import com.example.digital_academy_pda.services.UserService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    AdministrateurService uService = new AdministrateurServiceImplomentation();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // retun to register page
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // retrieve the data from the register page
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String confirmPassword = request.getParameter("con_password");
        String phone = request.getParameter("phone");
        String firstName = request.getParameter("firstname");
        String lastName = request.getParameter("lastname");
       // verify the data
        if (username.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || phone.isEmpty() || firstName.isEmpty() || lastName.isEmpty()) {
            // if the data is empty
            // return to register page and show error message
            request.setAttribute("error", "Please fill all the fields");
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } else {
            // if the data is not empty
            // check if the password and confirm password is the same
            if (password.equals(confirmPassword)) {
               // create an instance of the user class
                Administrateur admin = new Administrateur();
                // set the data to the user class
                admin.setUsername(username);
                admin.setEmail(email);
                admin.setPassword(password);
                admin.setTelephone(phone);
                admin.setPrenom(firstName);
                admin.setNom(lastName);
                // create an instance of the userdao class

                // save the user
                uService.add(admin);
                // redirect to login servlet
                response.sendRedirect("login");
            } else {
                // if the password and confirm password is not the same
                // return to register page
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
    }
}
