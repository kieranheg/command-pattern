package controller;

import service.Service;
import service.ServiceImpl;

public class Controller {
    public static void main(String[] args) {
        Service serviceImpl = new ServiceImpl();
        
        serviceImpl.executeDtoMappers();
        
    }
}
