package com.example.digital_academy_pda.services;
import com.example.digital_academy_pda.Entities.Role;

import java.util.List;

public interface RoleService {
    // method to get role by id
    Role getRoleById(int id);
    // method to get all roles
    List<Role> getAllRoles();

}
