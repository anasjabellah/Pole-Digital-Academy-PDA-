package com.example.digital_academy_pda.DAO;

public interface administrateurDao {
    // methods to log in and log out
    public void login();
    public void logout();

    public void remmoveAdministrateur(long id);

    public void updateAdministrateur(long id);


}
