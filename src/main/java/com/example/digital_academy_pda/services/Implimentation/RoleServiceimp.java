package com.example.digital_academy_pda.services.Implimentation;
import com.example.digital_academy_pda.Entities.Role;
import com.example.digital_academy_pda.services.RoleService;
import com.example.digital_academy_pda.Repository.RoleRepository;
import com.example.digital_academy_pda.Repository.Implimentation.RoleRepositoryimp;

public class RoleServiceimp implements RoleService {
    RoleRepository roleRepository = new RoleRepositoryimp();
    @Override
    public Role getRoleById(int id) {
        return roleRepository.getRoleById(id);
    }

}
