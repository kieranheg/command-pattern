package model.map;

import model.Command;
import model.dto.CoverageDto;
import model.dto.ParticipantDto;

public class MapParticipantToDto implements Command {
    private ParticipantDto participantDto;
    
    public MapParticipantToDto(ParticipantDto participantDto) {
        this.participantDto = participantDto;
    }
    
    @Override
    public void execute() {
        participantDto.map();
    }
}
