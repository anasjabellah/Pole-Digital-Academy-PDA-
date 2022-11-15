package com.example.digital_academy_pda.DAO.implementation;
import com.example.digital_academy_pda.DAO.roledao;
import com.example.digital_academy_pda.Entities.Role;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
public class roledaoimp implements roledao {
    // method to get role by id
    public Role getRoleById(int id) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager entityManager = emf.createEntityManager();
        entityManager.getTransaction().begin();
        Role role = entityManager.find(Role.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return role;
    }
}
