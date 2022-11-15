package com.example.digital_academy_pda.Repository;

import com.example.digital_academy_pda.Entities.Participant;

public interface ParticipantRepository {
    public Participant add(Participant participant);

    public void edit(Participant participant);

    public void delete(int id);

    public Participant getParticipant(Long id);
}
