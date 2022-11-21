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
        String email = "test@gmail.com";
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
        // saving the participant
        participantService.add(participant);
        // getting the participant by email
        Participant participant1 = participantService.findByEmail(email);
        // asserting the participant
        String expected = participant1.getEmail();
        // checking if the participant email is the same as the email we entered
        assertEquals(email, expected);
        assertEquals(firstname, participant1.getPrenom());
        assertEquals(lastname, participant1.getNom());
        assertEquals(Domaine, participant1.getDomaine());
        assertEquals(Phone, participant1.getTelephone());
        assertEquals(Structure, participant1.getStructure());
    }
    @org.junit.jupiter.api.Test
    void findByEmail() {
        String firstname = "firstname";
        String lastname = "lastname";
        String email = "user@gmail.com";
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
        // saving the participant
        participantService.add(participant);
        // getting the participant by email
        Participant participant1 = participantService.findByEmail(email);
        // asserting the participant
        String expected = participant1.getEmail();
        // checking if the participant email is the same as the email we entered
        assertEquals(email, expected);
    }
    // testing the edit method
    @org.junit.jupiter.api.Test
    void updateParticipant() {
        String firstname = "firstname";
        String lastname = "lastname";
        String email = "test@gmail.com";
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
        // saving the participant
        participantService.add(participant);
        // getting the participant by email
        Participant participant1 = participantService.findByEmail(email);
        // updating the participant
        participant1.setPrenom("new firstname");
        participant1.setNom("new lastname");
        participant1.setEmail("new email");
        participant1.setDomaine("new Domaine");
        participant1.setTelephone("new phone");
        participant1.setStructure("new structure");
        participant1.setEmail("new@gmail.com");
        participantService.updateParticipant(participant1);
        // getting the participant by email
        String newEmail = "new@gmail.com";
        Participant participant2 = participantService.findByEmail(newEmail);
        // asserting the participant
        String expected = participant2.getEmail();
        // checking if the participant email is the same as the email we entered
        assertEquals(newEmail, expected);
    }

    @org.junit.jupiter.api.Test
    void remmoveParticipant() {
        String firstname = "firstname";
        String lastname = "lastname";
        String email = "test@gmail.com";
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
        // saving the participant
        participantService.add(participant);
        // getting the participant by email
        Participant participant1 = participantService.findByEmail(email);
        // asserting the participant
        String expected = participant1.getEmail();
        // casting the participant id to long
        long id = (long) participant1.getId();
        participantService.remmoveParticipant((int) id);
        // turning the id into long
        long id1 = (long) id;
        // chechking if the participant is deleted
        assertEquals(null, participantService.getParticipant(id1));
    }
}