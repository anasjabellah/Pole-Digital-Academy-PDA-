package com.example.digital_academy_pda.DAO;

import com.example.digital_academy_pda.Entities.Responsable;

import java.util.List;

public interface ResponsableDAO {

    public Responsable add(Responsable responsable);

    public void edit(Responsable responsable);

    public void delete(int Id);

    public List<Responsable> listResponsable();

    public   Responsable getResponsable(Long Id);

}
