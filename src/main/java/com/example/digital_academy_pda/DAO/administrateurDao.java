package com.example.digital_academy_pda.DAO;

import com.example.digital_academy_pda.Entities.Administrateur;

public interface administrateurDao {
    // methods to log in and log out
    public void login();
    public void logout();

    Administrateur add(Administrateur admin);

    public void updateAdministrateur(long id);


}
