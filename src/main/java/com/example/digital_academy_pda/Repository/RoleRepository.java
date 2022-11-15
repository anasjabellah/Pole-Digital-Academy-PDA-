package com.example.digital_academy_pda.Repository;
import com.example.digital_academy_pda.Entities.Role;

import java.util.List;

public interface RoleRepository {
    // method to get role by id
    Role getRoleById(int id);
    // method to get all roles
    List<Role> getAllRoles();
}
