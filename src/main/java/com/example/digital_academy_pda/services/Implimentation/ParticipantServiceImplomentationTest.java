package com.example.digital_academy_pda.services.Implimentation;
import com.example.digital_academy_pda.Entities.Participant;
import com.example.digital_academy_pda.Entities.Role;
import com.example.digital_academy_pda.services.Implimentation.RoleServiceimp;

import static org.junit.jupiter.api.Assertions.*;

class ParticipantServiceImplomentationTest {

    @org.junit.jupiter.api.Test
    void add() {
        // getting all the roles
        Role role = new Role();
        RoleServiceimp roleServiceimp = new RoleServiceimp();
        role = roleServiceimp.getRoleById(1);
        Participant participant = new Participant();
        participant.setNom("test");
        participant.setPrenom("test");
        participant.setEmail("test@gmail.com");
        participant.setRole(role);
        participant.setTelephone("123456789");
        participant.setStructure("test");
        // adding the participant
        ParticipantServiceImplomentation participantService = new ParticipantServiceImplomentation();
        participantService.add(participant);
        // if the participant returned is true
        assertTrue(participantService.add(participant));
    }

    @org.junit.jupiter.api.Test
    void remmoveParticipant() {
    }
}