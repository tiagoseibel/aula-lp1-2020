package com.example.aula05.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.example.aula05.model.Pedido;
import com.example.aula05.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;

@Named(value = "pedidoBean")
@SessionScoped
public class PedidoBean {
   
   @Autowired
   private PedidoRepository repository;

   private Pedido pedido = new Pedido();
   private List<Pedido> pedidos = new ArrayList<>();

   public void save() {
      repository.save(pedido);
      this.pedido = new Pedido();
      this.pedidos = repository.findAll();
   }

   public Pedido getPedido() {
      return pedido;
   }

   public void setPedido(Pedido pedido) {
      this.pedido = pedido;
   }

   public List<Pedido> getPedidos() {
      pedidos = repository.findAll();
      return pedidos;
   }

   public void setPedidos(List<Pedido> pedidos) {
      this.pedidos = pedidos;
   }
   
}
