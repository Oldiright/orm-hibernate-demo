package org.example;


import org.example.entity.Client;
import org.example.entity.Planet;
import org.example.entity.Ticket;
import org.example.services.ClientCrudService;
import org.example.services.PlanetCrudService;
import org.example.services.TicketCrudService;

public class Main {
    public static void main(String[] args) {

//        TEST CODE FOR  ClientCrudService()
        ClientCrudService clientService = new ClientCrudService();

        // C-create a new client;
        Client client = new Client();
        client.setName("Mister Dou");
        clientService.saveClient(client);
        // R-read a client;
        Client clientFromDataBaseByName = clientService.findClientByName("Mister Dou");
        Client clientFromDataBaseById = clientService.findClientById(clientFromDataBaseByName.getId());
        System.out.println(clientFromDataBaseById);
        System.out.println(clientFromDataBaseByName);


        // U- update a client;
        clientFromDataBaseByName = clientService.findClientByName("Mister Dou");
        clientFromDataBaseByName.setName("Miss Dou");
        clientService.updateClient(clientFromDataBaseByName);
        System.out.println(clientService.findClientById(clientFromDataBaseByName.getId()));
        Client updatedClientFromDataBase = clientService.findClientById(clientFromDataBaseByName.getId());
        String clientFromDBAfterUpdate = "client from DB after update: " + updatedClientFromDataBase.getName();
        System.out.println(clientFromDBAfterUpdate);


        // D- delete
        clientService.deleteClient(updatedClientFromDataBase);
        Client clientAfterDelete = clientService.findClientById(updatedClientFromDataBase.getId());
        System.out.println("client from DB after delete: " + clientAfterDelete);

        //TEST CODE FOR  PlanetCrudService()
//        PlanetCrudService planetCrudService = new PlanetCrudService();

//
////        // C-create a new planet;
//        Planet planet = new Planet();
//        planet.setId("SDR");
//        planet.setName("Sandora");
//        planetCrudService.savePlanet(planet);
//        // R-read a client;
//        Planet planetFromDataBase = planetCrudService.findPlanetById("SDR");
//        planetFromDB = "planet from DB: " + planetFromDataBase.getName();
//        // U- update a client;

//        planetFromDataBase.setName("Strekoza");
//        planetCrudService.updatePlanet(planetFromDataBase);
//        Planet UpdatedplanetFromDataBase = planetCrudService.findPlanetById("SDR");
//        planetFromDBAfterUpdate = "planet from DB after update: " + UpdatedplanetFromDataBase.getName();
//        System.out.println(planetFromDBAfterUpdate);
//        // D- delete
//        planetCrudService.deletePlanet(UpdatedplanetFromDataBase);
//        Planet planetAfterDelete = planetCrudService.findPlanetById("SDR");
//


//        TicketCrudService ticketCrudService = new TicketCrudService();
//
//        //        // C-create a new ticket;
//        Ticket ticket = new Ticket();
//        Client newClient = new Client();
//        newClient.setId(1l);
//        Planet planetAt = planetCrudService.findPlanetById("MRY");
//        Planet planetFrom = planetCrudService.findPlanetById("VNS");
//        ticket.setToPlanetId(planetAt);
//        ticket.setFromPlanetId(planetFrom);
//        ticket.setClient(newClient);
//        ticketCrudService.saveTicket(ticket);
//
//        // R-read a ticket;
//        Ticket ticketFromDataBase = ticketCrudService.findTicketById(22l);
//        String ticketFromDB = "ticket from DB: " + ticketFromDataBase.getFromPlanetId()
//                + "-->" + ticketFromDataBase.getToPlanetId()
//                + " " + ticketFromDataBase.getCreatedAt().toString();
//        System.out.println(ticketFromDB);
//
//        // U- update a ticket;
//        Ticket updatedTicketFromDataBase = ticketCrudService.findTicketById(22l);
//        updatedTicketFromDataBase.setFromPlanetId(planetCrudService.findPlanetById("JPT"));
//        ticketCrudService.updateTicket(updatedTicketFromDataBase);
//        updatedTicketFromDataBase = ticketCrudService.findTicketById(22l);
//        ticketFromDB = "ticket from DB: " + updatedTicketFromDataBase.getFromPlanetId()
//                + "-->" + updatedTicketFromDataBase.getToPlanetId()
//                + " " + updatedTicketFromDataBase.getCreatedAt().toString();
//        System.out.println(ticketFromDB);
//
//        // D- delete
//        ticketCrudService.deleteTicket(ticketCrudService.findTicketById(22l));
//         Ticket ticketAfterDelete = ticketCrudService.findTicketById(22l);
//        System.out.println("Ticket After delete: " + ticketAfterDelete);



    }
}