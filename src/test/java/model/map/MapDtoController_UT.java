package model.map;

import model.dto.AssetDto;
import model.dto.CoverageDto;
import model.dto.ParticipantDto;
import org.junit.Test;

public class MapDtoController_UT {
    
    @Test
    public void testMapDtoController() {
        ComponentMapToDtoCommand coverageMapToDtoCommand = new ComponentMapToDtoCommand(new CoverageDto());
        ComponentMapToDtoCommand assetMapToDtoCommand = new ComponentMapToDtoCommand(new AssetDto());
        ComponentMapToDtoCommand participantMapToDtoCommand = new ComponentMapToDtoCommand(new ParticipantDto());
        
        MapDtoController mapDtoController = new MapDtoController();
        mapDtoController.addMapper(coverageMapToDtoCommand);
        mapDtoController.addMapper(assetMapToDtoCommand);
        mapDtoController.addMapper(participantMapToDtoCommand);
        
        mapDtoController.mapComponentsToDto();
    }
}
