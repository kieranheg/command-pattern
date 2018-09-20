package model.map;

import model.Command;
import model.dto.MapDto;

public class ComponentMapToDtoCommand implements Command {
    private MapDto assetDto;
    
    public ComponentMapToDtoCommand(MapDto assetDto) {
        this.assetDto = assetDto;
    }
    
    @Override
    public void execute() {
        assetDto.map();
    }
}
