package com.algaworks.algalog.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
public class ClienteControler {

  @GetMapping("/clientes")
  public List<Cliente> listar() {
    Cliente cliente1 = new Cliente();
    cliente1.setId(1L);
    cliente1.setNome("Joaquim");
    cliente1.setTelefone("34 99999-9999");
    cliente1.setEmail("joaquim@gmail.com");

    Cliente cliente2 = new Cliente();
    cliente2.setId(2L);
    cliente2.setNome("Joaquina");
    cliente2.setTelefone("34 99989-9999");
    cliente2.setEmail("joaquina@gmail.com");

    return Arrays.asList(cliente1, cliente2);
  }

}
