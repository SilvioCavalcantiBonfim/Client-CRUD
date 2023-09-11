package client.service.implementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import client.model.Address;
import client.model.Client;
import client.repository.AddressRepository;
import client.repository.ClientRepository;
import client.service.ClientService;
import client.service.ViaCepService;

@Service
public class ClientServiceImplementation implements ClientService {

  @Autowired
  private ClientRepository clientRepository;

  @Autowired
  private AddressRepository addressRepository;

  @Autowired
  private ViaCepService viaCepService;

  @Override
  public Iterable<Client> findAll() {
    return clientRepository.findAll();
  }

  @Override
  public Client findById(String id) {
    Optional<Client> client = clientRepository.findById(id);
    if (client.isEmpty()) {
      return null;
    }
    return client.get();
  }

  @Override
  public void save(Client client) {
    SaveClientAsAddr(client);
  }

  @Override
  public void update(String id, Client client) {
    Optional<Client> findClient = clientRepository.findById(id);
    if(findClient.isPresent()){
      SaveClientAsAddr(client);
    }
  }

  @Override
  public void delete(String id) {
    clientRepository.deleteById(id);
  }

  private void SaveClientAsAddr(Client client) {
    String cep = client.getAddress().getCep();
    Address address = addressRepository.findById(cep).orElseGet(() -> {
      Address newaddr = viaCepService.getCep(cep);
      addressRepository.save(newaddr);
      return newaddr;
    });
    client.setAddress(address);
    clientRepository.save(client);
  }
  
}
