package client.repository;

import org.springframework.data.repository.CrudRepository;

import client.model.Client;

public interface ClientRepository extends CrudRepository<Client, String> {}
