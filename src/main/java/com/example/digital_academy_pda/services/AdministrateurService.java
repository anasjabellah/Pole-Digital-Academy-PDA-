package com.example.digital_academy_pda.services;

import com.example.digital_academy_pda.Entities.Administrateur;
import com.example.digital_academy_pda.Repository.AdministrateurRepository;

public interface AdministrateurService {

    public void updateAdministrateur(long id);

    public void remmoveAdministrateur(long id);

}