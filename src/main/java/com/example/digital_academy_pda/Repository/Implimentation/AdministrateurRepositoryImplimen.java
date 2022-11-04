package com.example.digital_academy_pda.Repository.Implimentation;

import com.example.digital_academy_pda.DAO.administrateurDao;
import com.example.digital_academy_pda.DAO.implementation.administratorimp;
import com.example.digital_academy_pda.Entities.Administrateur;
import com.example.digital_academy_pda.Repository.AdministrateurRepository;

public class AdministrateurRepositoryImplimen {


    administrateurDao adminDoa = new administratorimp();
     // call the method from the DAO
    @Override
    public Administrateur add(Administrateur admin) {
        // TODO Auto-generated method stub
        return adminDoa.add(admin);
    }
    }
