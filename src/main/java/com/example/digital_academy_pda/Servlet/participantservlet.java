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

@WebServlet(name = "Servlet", value = "/participantServlet")
public class participantservlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // do get logic here
        // display the form
        request.getRequestDispatcher("participant.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // getting the parameters from the form
        String firstname = request.getParameter("firstname");
        String lastname = request.getParameter("lastname");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String domain = request.getParameter("domain");
        String structure = request.getParameter("Structure");
        String role_id = request.getParameter("role");
        // creating an instance of role
        Role role = new RoleServiceimp().getRoleById(Integer.parseInt(role_id));
        // creating an instance of the participant entity and setting the parameters in the constructor
        Participant participant = new Participant(firstname, lastname, email, phone, role, domain, structure);
        // seeting the setter methods
        participant.setNom(lastname);
        participant.setPrenom(firstname);
        participant.setEmail(email);
        participant.setTelephone(phone);
        participant.setRole(role);
        participant.setDomaine(domain);
        participant.setStructure(structure);
        // creating an instance of the participant service
        ParticipantService participantService = new ParticipantServiceImplomentation();
        // calling the add method
        participantService.add(participant);
        // redirecting to the participant page
        response.sendRedirect("participantServlet");
    }
}
