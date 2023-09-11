package client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import client.model.Address;

@FeignClient(name = "ViaCep", url = "https://viacep.com.br/ws")
public interface ViaCepService {
  @GetMapping("/{cep}/json/")
  Address getCep(@PathVariable("cep") String cep);
}
