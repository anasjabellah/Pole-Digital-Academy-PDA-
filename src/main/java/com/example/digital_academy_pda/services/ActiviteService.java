package com.example.digital_academy_pda.services;

import com.example.digital_academy_pda.Entities.Activite;
import com.example.digital_academy_pda.Entities.Responsable;

import java.util.List;

public interface ActiviteService {

    public void  Add(Activite activite);

    public  void  edit(long id);

    public  void  remove(long id);

    public List<Activite> listActivite();

    Activite getActivite(long id);
}
