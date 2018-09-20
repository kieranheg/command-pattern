package service;

import model.dto.AssetDto;
import model.dto.CoverageDto;
import model.dto.ParticipantDto;
import model.map.ComponentMapToDtoCommand;
import model.map.MapDtoController;

public class ServiceImpl implements Service {
    private MapDtoController mapDtoController;
    
    public ServiceImpl() {
        mapDtoController = new MapDtoController();
    }
    
    @Override
    public void executeDtoMappers() {
        mapDtoController.registerDtoMapper(new ComponentMapToDtoCommand(new CoverageDto()));
        mapDtoController.registerDtoMapper(new ComponentMapToDtoCommand(new AssetDto()));
        mapDtoController.registerDtoMapper(new ComponentMapToDtoCommand(new ParticipantDto()));
        mapDtoController.mapComponentsToDto();
    }
}
