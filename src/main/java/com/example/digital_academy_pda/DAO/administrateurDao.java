package com.example.digital_academy_pda.DAO;

import com.example.digital_academy_pda.Entities.Administrateur;

public interface administrateurDao {
    // methods to log in and log out

    Administrateur add(Administrateur admin);
    Administrateur login(Administrateur admin);

    Administrateur findAdminByemail(String email);
}
