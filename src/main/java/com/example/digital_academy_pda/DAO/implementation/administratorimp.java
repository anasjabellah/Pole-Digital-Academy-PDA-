package com.example.digital_academy_pda.DAO.implementation;
import com.example.digital_academy_pda.DAO.administrateurDao;
import com.example.digital_academy_pda.Entities.Administrateur;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class administratorimp implements administrateurDao {



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

   public Administrateur login(Administrateur admin) {
        // Search for admin in database by his email using entity manager and returning all his data With query
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        try {
            Administrateur admin1 = entityManager.createQuery("SELECT a FROM Administrateur a WHERE a.email = :email", Administrateur.class)
                    .setParameter("email", admin.getEmail())
                    .getSingleResult();
            entityManager.getTransaction().commit();
            entityManager.close();
            return admin1;
        } catch (Exception e) {
            admin = null;
            return admin;
        }
    }
    public Administrateur findAdminByemail(String email) {
        // Search for admin in database using entity manager and returning all his data
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Administrateur admin1 = entityManager.find(Administrateur.class, email);
        entityManager.getTransaction().commit();
        entityManager.close();
        return admin1;
    }
}
