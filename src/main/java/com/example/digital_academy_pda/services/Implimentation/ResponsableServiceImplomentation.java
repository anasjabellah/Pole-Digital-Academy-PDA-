package com.example.digital_academy_pda.services.Implimentation;

import com.example.digital_academy_pda.DAO.implementation.ResponsableImplemeDAO;
import com.example.digital_academy_pda.Entities.Responsable;
import com.example.digital_academy_pda.Repository.Implimentation.ResponsableRepositoryImplimentation;
import com.example.digital_academy_pda.Repository.ResponsableRepository;
import com.example.digital_academy_pda.services.ResponsableService;

import java.util.List;

public class ResponsableServiceImplomentation implements ResponsableService
{

    private ResponsableRepository  responRepository = new ResponsableRepositoryImplimentation();
    private ResponsableImplemeDAO responsableImplemeDAO = new ResponsableImplemeDAO();


    @Override
    public void Add(Responsable responsable) {
        responRepository.add(responsable);
    }

    @Override
    public List<Responsable> listResponsable() {
        return responsableImplemeDAO.listResponsable();
    }

    @Override
    public List<Responsable> searchResponsable(String search) {
        return null;
    }

    @Override
    public Responsable findByEmail(String email) {
        return null;
    }

    @Override
    public void updateResponsable(Responsable responsable) {
        responRepository.edit(responsable);
    }

    @Override
    public void remmoveResponsable(int idResponsable) {
        responRepository.delete(idResponsable);
    }

    @Override
    public  Responsable getResponsable(Long id){return responRepository.getResponsable(id);}
}
