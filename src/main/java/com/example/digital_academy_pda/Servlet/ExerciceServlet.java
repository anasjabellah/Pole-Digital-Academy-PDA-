package com.example.digital_academy_pda.Servlet;

import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.Entities.Exercice;
import com.example.digital_academy_pda.Entities.Responsable;
import com.example.digital_academy_pda.services.ExerciceServices;
import com.example.digital_academy_pda.services.Implimentation.ExerciceServicesImploment;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ExerciceServlet", urlPatterns ={ "/AddExercice" , "/editExercice" , "/DeletExercice" , "/listExercice" })

public class ExerciceServlet extends HttpServlet {

    ExerciceServices EXservices = new ExerciceServicesImploment();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){
            case "/AddExercice":

                List<Exercice> exercice = EXservices.listExercice();
                request.setAttribute("exercice",exercice);
                request.getRequestDispatcher("/AddExercice.jsp").forward(request, response);

                break;
            case "/editExercice":

                request.setAttribute("exercice" , EXservices.getExercice((Long) request.getAttribute("id")) );
                request.getRequestDispatcher("/editExercice.jsp").forward(request, response);

                break;
            case "/DeletExercice":
                break;

            case "/listExercice":

                List<Exercice> exercices = EXservices.listExercice();
                request.setAttribute("responsable",exercices);
                request.getRequestDispatcher("/Exercice.jsp").forward(request, response);
                break;
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){
            case "/AddExercice":
                break;
            case "/editExercice":
                break;
            case "/DeletExercice":
                break;
            case "/listExercice":
                break;
        }

    }
}
