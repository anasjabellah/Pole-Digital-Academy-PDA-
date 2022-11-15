package com.example.digital_academy_pda.services;
import com.example.digital_academy_pda.Entities.Participant;

import java.util.List;

public interface ParticipantService {
    // method to add a participant
    Participant add(Participant participant);

    public List<Participant> listParticipant();

    public List<Participant> searchParticipant(String search);

    public Participant findByEmail(String email);

    public void updateParticipant(Participant participant);

    public void remmoveParticipant(int idParticipant);

    public  Participant getParticipant(Long id);

}
