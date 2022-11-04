package com.example.digital_academy_pda.services;

import com.example.digital_academy_pda.Entities.Responsable;

import java.util.List;

public interface ResponsableService {

    public void  Add();
    public List<Responsable> listResponsable();
    public List<Responsable> searchResponsable(String search);
    public Responsable findByEmail(String email);
    public void updateResponsable(long idResponsable);
    public void remmoveResponsable(long idResponsable);
}
