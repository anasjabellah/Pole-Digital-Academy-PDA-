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
    public void update(Activite id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("pakha");
    }

    @Override
    public void remove(long id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Activite activite = entityManager.find(Activite.class, id);
        entityManager.remove(activite);
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
        Activite activite = entityManager.find(Activite.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("activite");
        return activite;
    }


}
