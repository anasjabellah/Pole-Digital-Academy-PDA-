package com.example.digital_academy_pda.Repository.Implimentation;

import com.example.digital_academy_pda.DAO.participantdao;
import com.example.digital_academy_pda.DAO.implementation.participantimp;
import com.example.digital_academy_pda.Entities.Participant;
import com.example.digital_academy_pda.Repository.ParticipantRepository;

public class ParticipantRepositoryimpl implements ParticipantRepository {
    participantdao participantDao = new participantimp();
    @Override
    public Participant add(Participant participant) {
        // TODO Auto-generated method stub
        return participantDao.addParticipant(participant);
    }
    @Override
    public void edit(Participant participant) {
        // TODO Auto-generated method stub
        participantDao.editParticipant(participant);
    }
    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        participantDao.deleteParticipant(id);
    }
    @Override
    public Participant getParticipant(Long id) {
        // TODO Auto-generated method stub
        return participantDao.getParticipant(id);
    }

}
