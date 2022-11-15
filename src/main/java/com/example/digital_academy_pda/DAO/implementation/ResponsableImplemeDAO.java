package com.example.digital_academy_pda.DAO.implementation;

import com.example.digital_academy_pda.DAO.ResponsableDAO;
import com.example.digital_academy_pda.Entities.Responsable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ResponsableImplemeDAO implements ResponsableDAO {


    @Override
    public Responsable add(Responsable responsable) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(responsable);
        entityManager.getTransaction().commit();
        entityManager.close();
        return responsable;

    }

    @Override
    public void edit(Responsable responsable) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(responsable);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public Responsable getResponsable(Long id){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Responsable responsable = new Responsable();
        try {
            Query query =  entityManager.createQuery("select r from Responsable r where r.id = id");
            responsable = (Responsable) query.getSingleResult();
            entityManager.getTransaction().commit();
        } catch (Exception ex) {

            entityManager.getTransaction().rollback();

            ex.printStackTrace();
        }
        return responsable;


    }

    @Override
    public void delete(int Id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        Responsable responsable = entityManager.find(Responsable.class, Id);
        entityManager.remove(responsable);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<Responsable> listResponsable() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select r from Responsable r");
        entityManager.getTransaction().commit();
        System.out.println("zzzz");
        return query.getResultList();
    }
}
