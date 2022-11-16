package com.example.digital_academy_pda.services.Implimentation;
import com.example.digital_academy_pda.Repository.Implimentation.ActiviteRepositoryImplimen;
import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.services.ActiviteService;

import java.util.List;

public class ActiviteServiceImplomentation implements ActiviteService {

    @Override
    public void Add(Activite activite) {
        // creatin a new object from ActiviteRepositoryImplimen
        ActiviteRepositoryImplimen activiteRepository = new ActiviteRepositoryImplimen();
        // calling the method Add from ActiviteRepositoryImplimen
        activiteRepository.Add(activite);
        return;
    }

    @Override
    public void update(Activite id) {
        // creatin a new object from ActiviteRepositoryImplimen
        ActiviteRepositoryImplimen activiteRepository = new ActiviteRepositoryImplimen();
        // calling the method update from ActiviteRepositoryImplimen
        activiteRepository.update(id);
        return;
    }

    @Override
    public void remove(long id) {
        // creatin a new object from ActiviteRepositoryImplimen
        ActiviteRepositoryImplimen activiteRepository = new ActiviteRepositoryImplimen();
        // calling the method remove from ActiviteRepositoryImplimen
        activiteRepository.remove(id);
        return;
    }

    @Override
    public List<Activite> listActivite() {
        // creatin a new object from ActiviteRepositoryImplimen
        ActiviteRepositoryImplimen activiteRepository = new ActiviteRepositoryImplimen();
        // calling the method listActivite from ActiviteRepositoryImplimen
        return activiteRepository.listActivite();
    }

    @Override
    public Activite getActivite(long id) {
        // creatin a new object from ActiviteRepositoryImplimen
        ActiviteRepositoryImplimen activiteRepository = new ActiviteRepositoryImplimen();
        // calling the method getActivite from ActiviteRepositoryImplimen
        return activiteRepository.getActivite(id);
    }
}
