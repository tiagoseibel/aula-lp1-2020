package com.example.aula05;

import java.util.List;

import com.example.aula05.model.Cliente;
import com.example.aula05.model.Pedido;
import com.example.aula05.repository.ClienteRepository;
import com.example.aula05.repository.PedidoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Aula05Application implements CommandLineRunner {

   public static void main(String[] args) {
      SpringApplication.run(Aula05Application.class, args);
   }

   @Override
   public void run(String... args) throws Exception {

   }
}
