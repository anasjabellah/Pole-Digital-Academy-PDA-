// user servlet
package com.example.digital_academy_pda.Servlet;
// importing the classes
import com.example.digital_academy_pda.Entities.User;
import com.example.digital_academy_pda.services.AdministrateurService;
import com.example.digital_academy_pda.services.Implimentation.AdministrateurServiceImplomentation;
import com.example.digital_academy_pda.services.Implimentation.UserServiceImplomentation;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
@WebServlet(name = "Userservlet", value = "/Userservlet")
public class Userservlet extends HttpServlet {
    AdministrateurService uService = new AdministrateurServiceImplomentation();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // retun to register page
        request.getRequestDispatcher("user.jsp").forward(request, response);
    }
    @Override
    // do post method
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // retrieve the data from the register page

    }
}