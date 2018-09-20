package model.map;

import model.dto.AssetDto;
import model.dto.CoverageDto;
import model.dto.ParticipantDto;
import org.junit.Test;

public class MapDtoController_UT {
    
    @Test
    public void testMapDtoController() {
        MapCoverageToDto mapCoverageToDto = new MapCoverageToDto(new CoverageDto());
        MapAssetToDto mapAssetToDto = new MapAssetToDto(new AssetDto());
        MapParticipantToDto mapParticipantToDto = new MapParticipantToDto(new ParticipantDto());
        
        
        MapDtoController mapDtoController = new MapDtoController();
        mapDtoController.addMapper(mapCoverageToDto);
        mapDtoController.addMapper(mapAssetToDto);
        mapDtoController.addMapper(mapParticipantToDto);
        
        mapDtoController.mapAllDto();
    }
}
