package controller;

import service.Service;
import service.ServiceImpl;

public class Controller {
    public static void main(String[] args) {
        Service service = new ServiceImpl();
        
        //setup map to DTO commands phase
        service.setUpCommands();
        
        // invoke mappers
        service.executeDtoMappers();
    }
}
