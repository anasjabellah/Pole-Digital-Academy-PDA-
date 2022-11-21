package com.example.digital_academy_pda.Repository;

import com.example.digital_academy_pda.Entities.Participant;

public interface ParticipantRepository {
    public boolean add(Participant participant);

    public boolean edit(Participant participant);

    public void delete(int id);

    public Participant getParticipant(Long id);

    Participant findByEmail(String email);
}
