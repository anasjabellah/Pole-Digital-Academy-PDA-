package com.example.digital_academy_pda.services.Implimentation;

import com.example.digital_academy_pda.Entities.Participant;
import com.example.digital_academy_pda.services.ParticipantService;
import com.example.digital_academy_pda.Repository.Implimentation.ParticipantRepositoryimpl;
import com.example.digital_academy_pda.Repository.ParticipantRepository;
import com.example.digital_academy_pda.DAO.implementation.participantimp;
import java.util.List;

public class ParticipantServiceImplomentation implements ParticipantService {
    // creating an instance of the participant repository
    ParticipantRepository participantRepository = new ParticipantRepositoryimpl();
    participantimp participantImplemeDAO = new participantimp();
    @Override
    public boolean add(Participant participant) {
        //
        if (participantRepository.add(participant)){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public List<Participant> listParticipant() {
        return participantImplemeDAO.listParticipant();
    }
    @Override
    public List<Participant> searchParticipant(String search) {
        return null;
    }
    @Override
    public Participant findByEmail(String email) {
        return participantImplemeDAO.findByEmail(email);
    }
    @Override
    public boolean updateParticipant(Participant participant) {
        if (participantRepository.edit(participant)){
            return true;
        }else {
            return false;
        }
    }
    @Override
    public void remmoveParticipant(int idParticipant) {
        participantRepository.delete(idParticipant);
    }
    @Override
    public  Participant getParticipant(Long id){return participantRepository.getParticipant(id);}

}
