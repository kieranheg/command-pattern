package model.map;

import model.Command;

import java.util.ArrayList;
import java.util.List;

public class MapDtoController {
    private List<Command> dtoMapperCommands = new ArrayList<>();
    
    public void addMapper(Command mapComponentCommand) {
        dtoMapperCommands.add(mapComponentCommand);
    }
    
    public void mapComponentsToDto() {
        dtoMapperCommands.stream().forEach(Command::execute);
    }
}
