package com.example.digital_academy_pda.Servlet;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import com.example.digital_academy_pda.Entities.Administrateur;
import com.example.digital_academy_pda.services.AdministrateurService;
import com.example.digital_academy_pda.services.Implimentation.AdministrateurServiceImplomentation;
import com.example.digital_academy_pda.services.Implimentation.UserServiceImplomentation;
import com.example.digital_academy_pda.services.UserService;
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
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        // print the username and password
        // check if the username and password is empty
        if (email.isEmpty() || password.isEmpty()) {
            // if the username or password is empty
            // return to login page
            request.getRequestDispatcher("test.jsp").forward(request, response);
        } else {
            // setting the email in the entity
            Administrateur admin = new Administrateur();
            admin.setEmail(email);
            // setting the password in the entity
            admin.setPassword(password);
            // create an instance of the userservice class
            AdministrateurService uService = new AdministrateurServiceImplomentation();
            // call the login method
            Administrateur isLogin = uService.login(admin);
            // if is empty
            if (isLogin == null) {
                // return to login page
                System.out.println("Login failed");
                response.sendRedirect("login");
            } else {
                // chechcking the user password is equal to the password in the database
                if (isLogin.getPassword().equals(password)) {
                    // if the password is correct
                    // create a session
                    HttpSession session = request.getSession();
                    // set the user in the session
                    session.setAttribute("user", isLogin);
                    // redirect to the home page
                    response.sendRedirect("/Pole_Digital_Academy_PDA_war_exploded/listResponsable");
                } else {
                    // if the password is incorrect
                    // return to login page
                    System.out.println("Login failed password");
                    response.sendRedirect("login");
                }
            }
        }
    }
}
