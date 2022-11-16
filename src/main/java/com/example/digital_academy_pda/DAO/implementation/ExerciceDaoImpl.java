package com.example.digital_academy_pda.DAO.implementation;

import com.example.digital_academy_pda.DAO.ExerciceDao;
import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.Entities.Exercice;
import com.example.digital_academy_pda.Entities.Responsable;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class ExerciceDaoImpl implements ExerciceDao {

    @Override
    public Exercice Add(Exercice exercice) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(exercice);
        entityManager.getTransaction().commit();
        entityManager.close();
        return exercice;

    }

    @Override
    public void edit(Exercice exercice) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(exercice);
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
    public List<Exercice> listExercice() {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("select e from Exercice e");
        entityManager.getTransaction().commit();
        return query.getResultList();

    }

    @Override
    public Exercice getExercice(long id) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Exercice exercice = new Exercice();

        try {

            Query query =  entityManager.createQuery("select a from Activite a where a.id = id");
            exercice = (Exercice) query.getSingleResult();
            entityManager.getTransaction().commit();

        } catch (Exception ex) {

            entityManager.getTransaction().rollback();
            ex.printStackTrace();
        }

        return exercice;
    }
}
