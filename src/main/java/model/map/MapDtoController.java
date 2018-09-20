package model.map;

import java.util.ArrayList;
import java.util.List;

public class MapDtoController {
    private List<Command> dtoMapperCommands = new ArrayList<>();
    
    void registerDtoMapper(Command mapComponentCommand) {
        dtoMapperCommands.add(mapComponentCommand);
    }
    
    void mapComponentsToDto() {
        dtoMapperCommands.forEach(Command::execute);
    }
}
