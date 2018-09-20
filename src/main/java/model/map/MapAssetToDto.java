package model.map;

import model.Command;
import model.dto.AssetDto;
import model.dto.CoverageDto;

public class MapAssetToDto implements Command {
    private AssetDto assetDto;
    
    public MapAssetToDto(AssetDto assetDto) {
        this.assetDto = assetDto;
    }
    
    @Override
    public void execute() {
        assetDto.map();
    }
}
