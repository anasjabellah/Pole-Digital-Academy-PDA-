package com.example.digital_academy_pda.DAO;
import com.example.digital_academy_pda.Entities.Role;

import java.util.List;

public interface roledao{
    // method to get role by id
    Role getRoleById(int id);
    // get all roles
    List<Role> getAllRoles();
}
