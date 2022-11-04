package com.example.digital_academy_pda.DAO.implementation;

import com.example.digital_academy_pda.DAO.administrateurDao;
import com.example.digital_academy_pda.Entities.Administrateur;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class administratorimp implements administrateurDao {
    // methods to log in and log out
    public void login() {
        // code to log in using entity

    }
    public void logout() {
    }

    @Override
    public Administrateur add(Administrateur admin) {
        // add admin to database using entity manager
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(admin);
        entityManager.getTransaction().commit();
        entityManager.close();
        return admin;
    }

    public void updateAdministrateur(long id){

    };
}
