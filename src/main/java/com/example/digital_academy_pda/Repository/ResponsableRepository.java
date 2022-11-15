package com.example.digital_academy_pda.Repository;

import com.example.digital_academy_pda.Entities.Responsable;

public interface ResponsableRepository {

    public void add(Responsable responsable);

    public void  edit(Responsable responsable);

    public void  delete(int id);

    public  Responsable getResponsable(Long id);

}
