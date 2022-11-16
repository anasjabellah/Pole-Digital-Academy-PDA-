package com.example.digital_academy_pda.Repository;

import com.example.digital_academy_pda.Entities.Activite;

import java.util.List;

public interface ActiviteRepository {

    public void  Add(Activite activite);

    public  void  update(Activite id);

    public  void  remove(long id);

    public List<Activite> listActivite();

    public  Activite getActivite(long id);

}
