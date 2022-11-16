package com.example.digital_academy_pda.Servlet;

import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.Entities.Exercice;
import com.example.digital_academy_pda.Entities.Responsable;
import com.example.digital_academy_pda.services.ActiviteService;
import com.example.digital_academy_pda.services.ExerciceServices;
import com.example.digital_academy_pda.services.Implimentation.ActiviteServiceImplomentation;
import com.example.digital_academy_pda.services.Implimentation.ExerciceServicesImploment;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ExerciceServlet", urlPatterns ={ "/AddExercice" , "/editExercice" , "/DeletExercice" , "/listExercice" })

public class ExerciceServlet extends HttpServlet {

    ExerciceServices EXservices = new ExerciceServicesImploment();
    ActiviteService ActivService = new ActiviteServiceImplomentation();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){
            case "/AddExercice":

                List<Activite> activites = ActivService.listActivite();
                request.setAttribute("activite", activites);
                request.getRequestDispatcher("/addExercice.jsp").forward(request, response);

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

                Exercice exercice = new Exercice();
                exercice.setTitle(request.getParameter("title"));
                exercice.setAnnee(request.getParameter("year"));
                exercice.setDateDebut(request.getParameter("start-date"));
                exercice.setDateDeFin(request.getParameter("end-date"));
                exercice.setActivite(ActivService.getActivite(Long.parseLong(request.getParameter("Activity-status"))));
                EXservices.Add(exercice);
                response.sendRedirect("/Pole_Digital_Academy_PDA_war_exploded/listExercice");

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
