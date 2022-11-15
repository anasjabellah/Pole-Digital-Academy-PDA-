package com.example.digital_academy_pda.services.Implimentation;

import com.example.digital_academy_pda.Entities.Participant;
import com.example.digital_academy_pda.services.ParticipantService;
import com.example.digital_academy_pda.Repository.Implimentation.ParticipantRepositoryimpl;
import com.example.digital_academy_pda.Repository.ParticipantRepository;

public class ParticipantServiceImplomentation implements ParticipantService {
    // creating an instance of the participant repository
    ParticipantRepository participantRepository = new ParticipantRepositoryimpl();
    @Override
    public Participant add(Participant participant) {
        return participantRepository.add(participant);
    }
}
