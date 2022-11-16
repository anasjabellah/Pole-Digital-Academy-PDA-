package com.example.digital_academy_pda.DAO.implementation;

import com.example.digital_academy_pda.DAO.ActiviteDao;
import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.Entities.Responsable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;


public class ActiviteImpDao implements ActiviteDao {


    @Override
    public Activite Add(Activite activite) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(activite);
        entityManager.getTransaction().commit();
        entityManager.close();
        return activite;
    }


    @Override
    public void edit(Activite activite) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");

        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(activite);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void remove(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        Responsable responsable = entityManager.find(Responsable.class, id);
        entityManager.remove(responsable);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public List<Activite> listActivite() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select a from Activite a");
        entityManager.getTransaction().commit();
        return query.getResultList();
    }

    @Override
    public Activite getActivite(long id) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Activite activite = new Activite();

        try {
            Query query =  entityManager.createQuery("select a from Activite a where a.id = id");
            activite = (Activite) query.getSingleResult();
            entityManager.getTransaction().commit();
        } catch (Exception ex) {

            entityManager.getTransaction().rollback();

            ex.printStackTrace();
        }

        return activite;
    }


}
