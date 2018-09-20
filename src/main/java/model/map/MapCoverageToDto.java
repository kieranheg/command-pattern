package model.map;

import model.Command;
import model.dto.CoverageDto;

public class MapCoverageToDto implements Command {
    CoverageDto coverageDto;
    
    public MapCoverageToDto(CoverageDto coverageDto) {
        this.coverageDto = coverageDto;
    }
    
    @Override
    public void execute() {
        coverageDto.map();
    }
}
