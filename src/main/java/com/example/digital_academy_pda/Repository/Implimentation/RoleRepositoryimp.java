package com.example.digital_academy_pda.Repository.Implimentation;
import com.example.digital_academy_pda.DAO.roledao;
import com.example.digital_academy_pda.DAO.implementation.roledaoimp;
import com.example.digital_academy_pda.Entities.Role;
import com.example.digital_academy_pda.Repository.RoleRepository;

import java.util.List;

public class RoleRepositoryimp implements RoleRepository {

    roledao roleDoa = new roledaoimp();
    // call the method from the DAO
    @Override
    public Role getRoleById(int id) {
        // TODO Auto-generated method stub
        return roleDoa.getRoleById(id);
    }
    // call the method from the DAO
    @Override
    public List<Role> getAllRoles() {
        // TODO Auto-generated method stub
        return roleDoa.getAllRoles();
    }

}
