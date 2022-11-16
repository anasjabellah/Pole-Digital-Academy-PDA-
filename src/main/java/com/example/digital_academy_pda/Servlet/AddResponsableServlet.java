package com.example.digital_academy_pda.Servlet;

import com.example.digital_academy_pda.Entities.Responsable;
import com.example.digital_academy_pda.services.Implimentation.ResponsableServiceImplomentation;
import com.example.digital_academy_pda.services.ResponsableService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "AddResponsableServlet", urlPatterns ={ "/AddResponsableServlet" , "/editResponsable" , "/DeletResponsable" , "/listResponsable" })
public class AddResponsableServlet extends HttpServlet {

    ResponsableService RespoService = new ResponsableServiceImplomentation();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){
            case  "/AddResponsableServlet":
                request.getRequestDispatcher("/addResponsable.jsp").forward(request, response);
                break;
            case "/editResponsable" :

                request.setAttribute("responsablee" , RespoService.getResponsable((Long) request.getAttribute("id")) );
                request.getRequestDispatcher("/editResponsable.jsp").forward(request, response);
                break;
            case  "/listResponsable" :

                List<Responsable> responsables = RespoService.listResponsable();
                request.setAttribute("responsable",responsables);
                request.getRequestDispatcher("/listResponsable.jsp").forward(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String urlPage = request.getRequestURI() ;
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded" , "");

        switch (urlPage){

            case  "/AddResponsableServlet":

                String firstname = request.getParameter("firstname");
                String lastname = request.getParameter("lastname");
                String email = request.getParameter("email");
                String phone = request.getParameter("phone");
                String Domaine = request.getParameter("Domaine");
                String type = request.getParameter("type");
                String Etat = request.getParameter("Etat");

                if ( firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || phone.isEmpty() || Domaine.isEmpty() || type.isEmpty()  || Etat.isEmpty() ){

                    request.setAttribute("error", "Please fill all the fields");
                    request.getRequestDispatcher("addResponsable.jsp").forward(request, response);

                }else {

                    Responsable responsable = new Responsable();
                    responsable.setPrenom(firstname);
                    responsable.setNom(lastname);
                    responsable.setEmail(email);
                    responsable.setTelephone(phone);
                    responsable.setDomaine(Domaine);
                    responsable.setType(type);
                    responsable.setEtat(Etat);
                    RespoService.Add(responsable);

                }

                break;
            case "/editResponsable" :

                long  id = Long.parseLong(request.getParameter("id"));
                String fname = request.getParameter("firstname");
                String lname = request.getParameter("lastname");
                String Email = request.getParameter("email");
                String Phone = request.getParameter("phone");
                String domaine = request.getParameter("Domaine");
                String Type = request.getParameter("type");
                String etat = request.getParameter("Etat");

                if ( fname.isEmpty() || lname.isEmpty() || Email.isEmpty() || Phone.isEmpty() || domaine.isEmpty() || Type.isEmpty()  || etat.isEmpty() ){

                    request.setAttribute("error", "Please fill all the fields");
                    request.getRequestDispatcher("addResponsable.jsp").forward(request, response);

                }else {

                    Responsable responsable = RespoService.getResponsable(id);
                    responsable.setPrenom(fname);
                    responsable.setNom(lname);
                    responsable.setEmail(Email);
                    responsable.setTelephone(Phone);
                    responsable.setDomaine(domaine);
                    responsable.setType(Type);
                    responsable.setEtat(etat);
                    RespoService.updateResponsable(responsable);

                  response.sendRedirect("/Pole_Digital_Academy_PDA_war_exploded/listResponsable");

                }

                break;
            case  "/DeletResponsable" :

                break;
        }


    }
}