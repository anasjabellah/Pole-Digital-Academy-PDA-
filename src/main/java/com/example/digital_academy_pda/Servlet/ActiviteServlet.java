package com.example.digital_academy_pda.Servlet;

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
                request.getRequestDispatcher("/AddActivite.jsp").forward(request, response);
                break;

            case "/editActivite":
                break;
            case "/DeletActivite":
                break;
            case "/listActivite":
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){
            case "/AddActivite":
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
