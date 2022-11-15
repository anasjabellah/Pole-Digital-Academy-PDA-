package com.example.digital_academy_pda.services.Implimentation;

import com.example.digital_academy_pda.Entities.Administrateur;
import com.example.digital_academy_pda.Repository.AdministrateurRepository;
import com.example.digital_academy_pda.Repository.Implimentation.AdministrateurRepositoryImplimen;
import com.example.digital_academy_pda.services.AdministrateurService;

public class AdministrateurServiceImplomentation implements AdministrateurService {

    AdministrateurRepository adminRepository = new AdministrateurRepositoryImplimen();

    @Override
    public Administrateur add(Administrateur admin) {
        return adminRepository.add(admin);
    }
    public Administrateur login(Administrateur admin) {
        return adminRepository.login(admin);
    }
}
