package com.example.aula05.repository;

import com.example.aula05.model.Pedido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository 
   extends JpaRepository<Pedido, Integer>{
   
}
