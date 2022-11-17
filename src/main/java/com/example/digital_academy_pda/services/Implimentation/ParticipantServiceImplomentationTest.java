package com.example.digital_academy_pda.services.Implimentation;
import com.example.digital_academy_pda.Entities.Participant;
import com.example.digital_academy_pda.Entities.Role;
import com.example.digital_academy_pda.services.Implimentation.RoleServiceimp;

import static org.junit.jupiter.api.Assertions.*;

class ParticipantServiceImplomentationTest {

    @org.junit.jupiter.api.Test
    void add() {
        String firstname = "firstname";
        String lastname = "lastname";
        String email = "email";
        String Domaine = "Domaine";
        String Phone = "phone";
        String Structure = "structure";
        int Role = 1;
        // participant service
        ParticipantServiceImplomentation participantService = new ParticipantServiceImplomentation();
        Participant participant = new Participant();
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
        // Creating an instance of the RoleService
        RoleServiceimp roleService = new RoleServiceimp();
        // getting the role of the participant by id
        Role role = roleService.getRoleById(Role);
        // setting the role of the participant
        participant.setRole(role);
        // if the participant returned is true
        assertTrue(participantService.add(participant));
    }

    @org.junit.jupiter.api.Test
    void remmoveParticipant() {
    }
}