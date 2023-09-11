package client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import client.model.Client;
import client.service.ClientService;

@RestController
@RequestMapping("api/cleints")
public class CleintController {
  
  @Autowired
  private ClientService clientService;

  @GetMapping
  public ResponseEntity<Iterable<Client>> findAll(){
    return ResponseEntity.ok(clientService.findAll());
  }
  @GetMapping("/{id}")
	public ResponseEntity<Client> findById(@PathVariable String id) {
		return ResponseEntity.ok(clientService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Client> inserir(@RequestBody Client client) {
		clientService.save(client);
		return ResponseEntity.ok(client);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Client> atualizar(@PathVariable String id, @RequestBody Client client) {
		clientService.update(id, client);
		return ResponseEntity.ok(client);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletar(@PathVariable String id) {
		clientService.delete(id);
		return ResponseEntity.ok().build();
	}
}
