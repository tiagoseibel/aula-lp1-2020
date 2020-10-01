package com.example.aula05.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.example.aula05.model.Cliente;
import com.example.aula05.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Named(value = "clienteBean")
@SessionScoped
public class ClienteBean {
   
   @Autowired
   private ClienteRepository repository;

   private Cliente cliente = new Cliente();
   private List<Cliente> clientes = new ArrayList<>();

   public void save() {
      repository.save(cliente);
   }

   public Cliente getCliente() {
      return cliente;
   }

   public void setCliente(Cliente cliente) {
      this.cliente = cliente;
   }

   public List<Cliente> getClientes() {
      clientes = repository.findAll();
      return clientes;
   }

   public void setClientes(List<Cliente> clientes) {
      this.clientes = clientes;
   }

   

}
