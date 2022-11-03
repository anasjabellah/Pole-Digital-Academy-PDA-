package com.example.digital_academy_pda.Repository;

import com.example.digital_academy_pda.Entities.Administrateur;
import com.example.digital_academy_pda.services.AdministrateurService;

public interface AdministrateurRepository {

    public void update(long id);

    public void remmove(long id);

}
