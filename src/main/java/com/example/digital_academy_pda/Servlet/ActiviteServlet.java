package com.example.digital_academy_pda.Servlet;

import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.Entities.Responsable;
import com.example.digital_academy_pda.services.ActiviteService;
import com.example.digital_academy_pda.services.Implimentation.ActiviteServiceImplomentation;
import com.example.digital_academy_pda.services.Implimentation.ResponsableServiceImplomentation;
import com.example.digital_academy_pda.services.ResponsableService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ActiviteServlet", urlPatterns ={ "/AddActivite" , "/editActivite" , "/DeletActivite" , "/listActivite" })
public class ActiviteServlet extends HttpServlet {

    ResponsableService RespoService = new ResponsableServiceImplomentation();
    ActiviteService  ActivService = new ActiviteServiceImplomentation();



    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){
            case "/AddActivite":

                List<Responsable> responsables = RespoService.listResponsable();
                request.setAttribute("responsable",responsables);
                request.getRequestDispatcher("/addActivite.jsp").forward(request, response);
                break;

            case "/editActivite":
                // get the list of responsable
                List<Responsable> responsables1 = RespoService.listResponsable();
                request.setAttribute("responsable",responsables1);
                request.setAttribute("activite" , ActivService.getActivite((Long) request.getAttribute("id")) );
                request.getRequestDispatcher("/editActivite.jsp").forward(request, response);
                break;

            case "/DeletActivite":
                break;
            case "/listActivite":

                List<Activite> activites = ActivService.listActivite();
                request.setAttribute("responsable",activites);
                request.getRequestDispatcher("/listActivite.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){
            case "/AddActivite":
                // gett all parametres and create new Activite
                Activite activite = new Activite();
                activite.setTitre(request.getParameter("title"));
                activite.setDescriptif(request.getParameter("description"));
                activite.setType(request.getParameter("type"));
                activite.setStatut(request.getParameter("statut"));
                // getting date from form and convert it to date
                activite.setDateDebut(java.sql.Date.valueOf(request.getParameter("startdate")));
                activite.setDateDeFin(java.sql.Date.valueOf(request.getParameter("enddate")));
                activite.setStatut(request.getParameter("activitystate"));
                activite.setType(request.getParameter("activitytype"));
                activite.setResponsable(RespoService.getResponsable(Long.parseLong(request.getParameter("responsible"))));
                System.out.println("a o k");
                ActivService.Add(activite);
                System.out.println("a o k");
                response.sendRedirect("/Pole_Digital_Academy_PDA_war_exploded/listActivite");
                break;
            case "/editActivite":
                break;
            case "/DeletActivite":
                break;
            case "/listActivite":
                break;
        }
    }
}
