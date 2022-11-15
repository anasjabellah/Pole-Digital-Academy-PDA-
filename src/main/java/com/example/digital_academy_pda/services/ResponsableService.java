package com.example.digital_academy_pda.services;

import com.example.digital_academy_pda.Entities.Responsable;

import java.util.List;

public interface ResponsableService {

    public void  Add(Responsable responsable);
    public List<Responsable> listResponsable();
    public List<Responsable> searchResponsable(String search);
    public Responsable findByEmail(String email);
    public void updateResponsable(Responsable responsable);
    public void remmoveResponsable(int idResponsable);

    public  Responsable getResponsable(Long id);
}
