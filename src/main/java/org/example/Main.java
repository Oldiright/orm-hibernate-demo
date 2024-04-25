package org.example;


import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.services.ClientCrudService;
import org.example.services.PlanetCrudService;

public class Main {
    public static void main(String[] args) {

        //TEST CODE FOR  ClientCrudService()
        ClientCrudService clientService = new ClientCrudService();
        String clientFromDB;
        String clientFromDBAfterUpdate;

        // C-create a new client, his id will be 11;
        Client client = new Client();
        client.setName("Mister Dou");
        clientService.saveClient(client);
        // R-read a client;
        Client clientFromDataBase = clientService.findClientById(11l);
        clientFromDB = "client from DB: " + clientFromDataBase.getName();
        // U- update a client;
        clientFromDataBase.setName("Miss Dou");
        clientService.updateClient(clientFromDataBase);
        Client UpdatedClientFromDataBase = clientService.findClientById(11l);
        clientFromDBAfterUpdate = "client from DB after update: " + UpdatedClientFromDataBase.getName();
        // D- delete
        clientService.deleteClient(clientFromDataBase);
        Client clientAfterDelete = clientService.findClientById(11l);

        //TEST CODE FOR  PlanetCrudService()
        PlanetCrudService planetCrudService = new PlanetCrudService();
        String planetFromDB;
        String planetFromDBAfterUpdate;

        // C-create a new planet;
        Planet planet = new Planet();
        planet.setId("PNR");
        planet.setName("Pandora");
        planetCrudService.savePlanet(planet);
        // R-read a client;
        Planet planetFromDataBase = planetCrudService.findPlanetById("PNR");
        planetFromDB = "planet from DB: " + planetFromDataBase.getName();
        // U- update a client;
        planetFromDataBase.setName("Edem");
        planetCrudService.updatePlanet(planetFromDataBase);
        Planet UpdatedplanetFromDataBase = planetCrudService.findPlanetById("PNR");
        planetFromDBAfterUpdate = "planet from DB after update: " + UpdatedplanetFromDataBase.getName();
        // D- delete
        planetCrudService.deletePlanet(UpdatedplanetFromDataBase);
        Planet planetAfterDelete = planetCrudService.findPlanetById("PNR");



        System.out.println(clientFromDB);
        System.out.println(clientFromDBAfterUpdate);
        System.out.println("client after delete: " + clientAfterDelete);
        System.out.println(planetFromDB);
        System.out.println(planetFromDBAfterUpdate);
        System.out.println(planetAfterDelete);


    }
}