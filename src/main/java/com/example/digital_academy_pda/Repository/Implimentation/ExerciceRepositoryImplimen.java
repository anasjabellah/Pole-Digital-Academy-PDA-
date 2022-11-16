package com.example.digital_academy_pda.Repository.Implimentation;

import com.example.digital_academy_pda.DAO.ExerciceDao;
import com.example.digital_academy_pda.DAO.implementation.ExerciceDaoImpl;
import com.example.digital_academy_pda.Entities.Exercice;
import com.example.digital_academy_pda.Repository.ExerciceRepository;

import java.util.List;

public class ExerciceRepositoryImplimen implements ExerciceRepository {


    private ExerciceDao ExDao = new ExerciceDaoImpl();
    @Override
    public void Add(Exercice exercice) {
         ExDao.Add(exercice);
    }

    @Override
    public void edit(Exercice exercice) {
        ExDao.edit(exercice);
    }

    @Override
    public void remove(long id) {
        ExDao.remove(id);
    }

    @Override
    public List<Exercice> listExercice() {
        return ExDao.listExercice();
    }

    @Override
    public Exercice getExercice(long id) {
        return ExDao.getExercice(id);
    }

}
