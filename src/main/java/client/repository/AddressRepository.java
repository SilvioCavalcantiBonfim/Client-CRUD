package client.repository;

import org.springframework.data.repository.CrudRepository;

import client.model.Address;

public interface AddressRepository extends CrudRepository<Address, String> {}
