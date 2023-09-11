package client.service;

import client.model.Client;

public interface ClientService {

  Iterable<Client> findAll();

  Client findById(String id);

  void save(Client client);

  void update(String id, Client client);

  void delete(String id);
  
}
