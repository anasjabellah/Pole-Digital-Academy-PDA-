package com.example.digital_academy_pda.services;

import com.example.digital_academy_pda.Entities.Administrateur;

public interface AdministrateurService {

    Administrateur add(Administrateur admin);
    Administrateur login(Administrateur admin);
}
