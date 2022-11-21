package com.example.digital_academy_pda.DAO.implementation;

import com.example.digital_academy_pda.DAO.participantdao;
import com.example.digital_academy_pda.Entities.Participant;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class participantimp implements participantdao {
    // method to save participant
    @Override
    public boolean addParticipant(Participant participant) {
        // add participant to database using entity manager
    try {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(participant);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }catch (Exception e){
        e.printStackTrace();
        return false;
    }
    }
    @Override
    public boolean editParticipant(Participant participant) {
        try {
            // edit participant to database using entity manager
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager entityManager = emf.createEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(participant);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
    @Override
    public Participant getParticipant(Long id){
        // get participant to database using entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Participant participant = new Participant();
        // printing the id of the participant
        System.out.println("id of participant is " + id);
        try {
            // using entity manager to get participant from database with the id with out query
            participant = entityManager.find(Participant.class, id);
            entityManager.getTransaction().commit();
            // return participant
            return participant;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            ex.printStackTrace();
            System.out.println("Not working");
            System.out.println("id of participant is " + id);
        }
        return participant;
    }
    @Override
    public void deleteParticipant(int Id) {
        // delete participant to database using entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Participant participant = entityManager.find(Participant.class, Id);
        entityManager.remove(participant);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
    @Override
    public List<Participant> listParticipant() {
        // list participant to database using entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        List<Participant> participantList = entityManager.createQuery("select p from Participant p").getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return participantList;
    }
    public Participant findByEmail(String email){
        // find participant by email to database using entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Participant participant = new Participant();
        try {
            // using entity manager to get participant from database
            participant = entityManager.createQuery("select p from Participant p where p.email = :email", Participant.class).setParameter("email", email).getSingleResult();
            entityManager.getTransaction().commit();
            // return participant
            System.out.println("email of participant is " + participant.getEmail());
            return participant;
        } catch (Exception ex) {
            entityManager.getTransaction().rollback();
            ex.printStackTrace();
            System.out.println("Not working");
            System.out.println("id of participant is " + email);
        }
        return participant;
    }
}
