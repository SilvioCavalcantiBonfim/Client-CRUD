package client.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Entity
public class Address {
  @Id
  private String cep;
  private String logradouro;
  private String complemento;
  private String bairro;
  private String localizacao;
  private String uf;
  private String ibge;
  private String ddd;
  private String gia;
  private String siafi;
  
}
