package com.example.aula05.beans;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.sql.DataSource;

import com.example.aula05.config.ReportUtil;
import com.example.aula05.model.Cliente;
import com.example.aula05.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Named(value = "clienteBean")
@SessionScoped
public class ClienteBean {

   @Autowired
   private DataSource localDataSource;

   @Autowired
   private ClienteRepository repository;

   private Cliente cliente = new Cliente();
   private List<Cliente> clientes = new ArrayList<>();

   public void save() {
      repository.save(cliente);
      this.cliente = new Cliente();
   }

   public void select(Cliente cli) {
      this.cliente = cli;
   }

   public void print() {
      ReportUtil rpt = new ReportUtil();
      try {
         rpt.imprimirRelatorio("report_clientes", new HashMap<>(), localDataSource.getConnection());
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }

   public void delete(Cliente cli) {
      repository.delete(cli);
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
