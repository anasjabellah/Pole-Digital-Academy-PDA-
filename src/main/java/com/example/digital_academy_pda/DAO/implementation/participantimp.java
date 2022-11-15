package com.example.digital_academy_pda.DAO.implementation;

import com.example.digital_academy_pda.DAO.participantdao;
import com.example.digital_academy_pda.Entities.Participant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class participantimp implements participantdao {
    // method to save participant
    @Override
    public Participant addParticipant(Participant participant) {
        // add participant to database using entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(participant);
        entityManager.getTransaction().commit();
        entityManager.close();
        return participant;
    }
}