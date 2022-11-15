package com.example.digital_academy_pda.Servlet;
// importing entity of participant
import com.example.digital_academy_pda.Entities.Participant;
// importing participant dao
import com.example.digital_academy_pda.DAO.participantdao;

import com.example.digital_academy_pda.Entities.Role;
import com.example.digital_academy_pda.services.Implimentation.ParticipantServiceImplomentation;
import com.example.digital_academy_pda.services.Implimentation.RoleServiceimp;
import com.example.digital_academy_pda.services.ParticipantService;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "participantservlet", urlPatterns = {"/Participant", "/editParticipant", "/DeletParticipant", "/listParticipant", "/addParticipant"})
public class participantservlet extends HttpServlet {
    ParticipantService participantService = new ParticipantServiceImplomentation();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlPage = request.getRequestURI();
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded", "");
        switch (urlPage){
            case "/addParticipant":
                request.getRequestDispatcher("/AddParticipant.jsp").forward(request, response);
                break;
            case "/editParticipant":
                // getting the id of the participant from url
                Long id = Long.parseLong(request.getParameter("id"));
                // printing the id of the participant
                System.out.println(id);
                request.setAttribute("participantt", participantService.getParticipant(id));
                request.getRequestDispatcher("/editParticipant.jsp").forward(request, response);
                break;
            case "/listParticipant":
                List<Participant> participants = participantService.listParticipant();
                request.setAttribute("participant", participants);
                request.getRequestDispatcher("/listParticipant.jsp").forward(request, response);
                break;
            case "/DeletParticipant":
                int idd = Integer.parseInt(request.getParameter("id"));
                participantService.remmoveParticipant(idd);
                // redirecting to the list of participant
                response.sendRedirect("/Pole_Digital_Academy_PDA_war_exploded/listParticipant");
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String urlPage = request.getRequestURI();
        urlPage = urlPage.replace("/Pole_Digital_Academy_PDA_war_exploded", "");
        switch (urlPage){
            case "/editParticipant":
                // getting the id of the participant from url
                Long id = Long.parseLong(request.getParameter("id"));
                // getting the participant from the form and storing it in a variable
                String firstname = request.getParameter("firstname");
                String lastname = request.getParameter("lastname");
                String email = request.getParameter("email");
                String Domaine = request.getParameter("Domaine");
                String Phone = request.getParameter("phone");
                String Structure = request.getParameter("Structure");
                // checking if any parameter is empty
                if (firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || Domaine.isEmpty() || Phone.isEmpty() || Structure.isEmpty()){
                    request.setAttribute("error", "Please fill all the fields");
                    request.getRequestDispatcher("/editParticipant.jsp").forward(request, response);
                }else{
                    // creating a new participant
                    Participant participant = new Participant();
                    // setting the id of the participant
                    participant.setId(id);
                    // setting the firstname of the participant
                    participant.setPrenom(firstname);
                    // setting the lastname of the participant
                    participant.setNom(lastname);
                    // setting the email of the participant
                    participant.setEmail(email);
                    // setting the Domaine of the participant
                    participant.setDomaine(Domaine);
                    // setting the Phone of the participant
                    participant.setTelephone(Phone);
                    // setting the Structure of the participant
                    participant.setStructure(Structure);
                    // updating the participant
                    participantService.updateParticipant(participant);
                    // redirecting to the list of participant
                    response.sendRedirect("/Pole_Digital_Academy_PDA_war_exploded/listParticipant");

                }
                break;
            case "/addParticipant":
                // getting the participant from the form and storing it in a variable
                firstname = request.getParameter("firstname");
                lastname = request.getParameter("lastname");
                email = request.getParameter("email");
                Domaine = request.getParameter("Domaine");
                Phone = request.getParameter("phone");
                Structure = request.getParameter("Structure");
                // checking if any parameter is empty
                if (firstname.isEmpty() || lastname.isEmpty() || email.isEmpty() || Domaine.isEmpty() || Phone.isEmpty() || Structure.isEmpty()){
                    request.setAttribute("error", "Please fill all the fields");
                    request.getRequestDispatcher("/AddParticipant.jsp").forward(request, response);
                }else{
                    // creating a new participant
                    Participant participant = new Participant();
                    // setting the firstname of the participant
                    participant.setPrenom(firstname);
                    // setting the lastname of the participant
                    participant.setNom(lastname);
                    // setting the email of the participant
                    participant.setEmail(email);
                    // setting the Domaine of the participant
                    participant.setDomaine(Domaine);
                    // setting the Phone of the participant
                    participant.setTelephone(Phone);
                    // setting the Structure of the participant
                    participant.setStructure(Structure);

                    // adding the participant
                    participantService.add(participant);
                    // redirecting to the list of participant
                    response.sendRedirect("/Pole_Digital_Academy_PDA_war_exploded/listParticipant");
                }
                break;
        }
    }
}
