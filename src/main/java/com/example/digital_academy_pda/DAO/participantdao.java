package com.example.digital_academy_pda.DAO;
import com.example.digital_academy_pda.Entities.Participant;
import java.util.List;

public interface participantdao {
    // method to save participant
    public Participant addParticipant(Participant participant);

    public void editParticipant(Participant participant);

    public void deleteParticipant(int Id);

    public List<Participant> listParticipant();
    // method to get q participant
    public Participant getParticipant(Long Id);

}
