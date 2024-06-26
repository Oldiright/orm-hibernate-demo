package org.example.db.dao;

import org.example.HibernateUtil;
import org.example.entity.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class ClientDao {
    private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();

    // Create
    public void save(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.save(client);
            tx.commit();
        }
    }

    // Read
    public Client findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return session.get(Client.class, id);
        }
    }
    public Client findByName(String name) {
        try (Session session = sessionFactory.openSession()){
            String query = "from Client c WHERE name = '%s'";
            query = String.format(query, name);
            System.out.println(query);
            List<Client> clientList = session.createQuery(query , Client.class).list();
            System.out.println(clientList.isEmpty());
            return clientList.get(0);
        }
    }

    // Update
    public void update(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.update(client);
            tx.commit();
        }
    }

    // Delete
    public void delete(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(client);
            tx.commit();
        }
    }
}
