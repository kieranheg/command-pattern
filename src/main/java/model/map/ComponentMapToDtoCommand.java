package model.map;

import model.dto.MapDto;

public class ComponentMapToDtoCommand implements Command {
    private MapDto componentToMapToDto;
    
    public ComponentMapToDtoCommand(MapDto componentToMapToDto) {
        this.componentToMapToDto = componentToMapToDto;
    }
    
    @Override
    public void execute() {
        componentToMapToDto.map();
    }
}
