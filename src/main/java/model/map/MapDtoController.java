package model.map;

import model.Command;

import java.util.ArrayList;
import java.util.List;

public class MapDtoController {
    private List<Command> dtoMappers = new ArrayList<>();
    
    public void addMapper(Command mapCommand) {
        dtoMappers.add(mapCommand);
    }
    
    public void mapAllDto() {
        dtoMappers.stream().forEach(Command::execute);
    }
}
