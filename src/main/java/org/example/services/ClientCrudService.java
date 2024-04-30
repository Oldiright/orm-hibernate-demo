package org.example.services;


import org.example.db.dao.ClientDao;
import org.example.entity.Client;

public class ClientCrudService {
    private ClientDao clientDao = new ClientDao();

    public void saveClient(Client client) {
        clientDao.save(client);
    }

    public Client findClientById(Long id) {
        return clientDao.findById(id);
    }
    public Client findClientByName(String name) {return  clientDao.findByName(name);}

    public void updateClient(Client client) {
        clientDao.update(client);
    }

    public void deleteClient(Client client) {
        clientDao.delete(client);
    }
}
