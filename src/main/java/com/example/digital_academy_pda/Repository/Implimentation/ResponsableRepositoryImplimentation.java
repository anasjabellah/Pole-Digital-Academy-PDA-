package com.example.digital_academy_pda.Repository.Implimentation;

import com.example.digital_academy_pda.DAO.ResponsableDAO;
import com.example.digital_academy_pda.DAO.implementation.ResponsableImplemeDAO;
import com.example.digital_academy_pda.Entities.Responsable;
import com.example.digital_academy_pda.Repository.ResponsableRepository;


public class ResponsableRepositoryImplimentation implements ResponsableRepository {

    private ResponsableDAO respDAO = new ResponsableImplemeDAO();


    public ResponsableDAO getUserDao() {
        return respDAO;
    }

    public void setUserDao(ResponsableImplemeDAO respDAO) {
        this.respDAO = respDAO;
    }

    @Override
    public void add(Responsable responsable) {
        respDAO.add(responsable);
    }

    @Override
    public void edit(Responsable responsable) {
        respDAO.edit(responsable);
    }

    @Override
    public void delete(int id) {
        respDAO.delete(id);
    }

    @Override
    public  Responsable  getResponsable(Long id){return respDAO.getResponsable(id);}

}
