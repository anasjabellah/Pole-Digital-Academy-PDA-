package com.example.digital_academy_pda.Repository.Implimentation;
import com.example.digital_academy_pda.DAO.implementation.ActiviteImpDao;
import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.Repository.ActiviteRepository;

import java.util.List;

public class ActiviteRepositoryImplimen implements ActiviteRepository {

    @Override
    public void Add(Activite activite) {
        // create a new activite
        ActiviteImpDao activiteImpDao = new ActiviteImpDao();
        activiteImpDao.Add(activite);
        return ;
    }

    @Override
    public void update(Activite id) {
        // create a new activite
        ActiviteImpDao activiteImpDao = new ActiviteImpDao();
        activiteImpDao.update(id);
        return ;
    }

    @Override
    public void remove(long id) {
        // create a new activite
        ActiviteImpDao activiteImpDao = new ActiviteImpDao();
        activiteImpDao.remove(id);
        return ;
    }

    @Override
    public List<Activite> listActivite() {
        // list all activite
        ActiviteImpDao activiteImpDao = new ActiviteImpDao();
        return activiteImpDao.listActivite();
    }

    @Override
    public Activite getActivite(long id) {
        // get a activite by id
        ActiviteImpDao activiteImpDao = new ActiviteImpDao();
        return activiteImpDao.getActivite(id);
    }
}
