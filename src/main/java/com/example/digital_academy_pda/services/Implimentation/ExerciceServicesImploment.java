package com.example.digital_academy_pda.services.Implimentation;

import com.example.digital_academy_pda.Entities.Exercice;
import com.example.digital_academy_pda.Repository.ExerciceRepository;
import com.example.digital_academy_pda.Repository.Implimentation.ExerciceRepositoryImplimen;
import com.example.digital_academy_pda.services.ExerciceServices;

import java.util.List;

public class ExerciceServicesImploment implements ExerciceServices {


    @Override
    public void Add(Exercice exercice) {
        ExerciceRepository exerciceRepository = new ExerciceRepositoryImplimen();
        exerciceRepository.Add(exercice);
    }

    @Override
    public void edit(long id) {

    }

    @Override
    public void remove(long id) {

    }

    @Override
    public List<Exercice> listExercice() {
        return null;
    }

    @Override
    public Exercice getExercice(long id) {
        return null;
    }
}
