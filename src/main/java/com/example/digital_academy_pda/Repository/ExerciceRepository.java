package com.example.digital_academy_pda.Repository;

import com.example.digital_academy_pda.DAO.ExerciceDao;
import com.example.digital_academy_pda.Entities.Exercice;

import java.util.List;

public interface ExerciceRepository {

    public void Add(Exercice exercice);

    public  void  edit(Exercice exercice);

    public  void  remove(long id);

    public List<Exercice> listExercice();

    Exercice getExercice(long id);

}
