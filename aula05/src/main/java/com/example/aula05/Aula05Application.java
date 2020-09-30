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
   
   @Autowired
   private ClienteRepository repository;

   // DI  Dependency Injection (Injeção de dependencia)
   @Autowired
   private PedidoRepository pedidoRepository;

    @Override
    public void run(String... args) throws Exception {

      Cliente busca = repository.findByCnpj("12345678901234");
      System.out.println("cliente="+ busca.getNomefantasia());

      List<Cliente> busca2 = repository.findPersonalizado("%ea%");

      for (Cliente x : busca2) {
         System.out.println("Cliente ---> " + x.getNomefantasia());
      }

      //Cliente a1 = new Cliente();
      //a1.setNomefantasia("Empresa Java 12");
      //a1.setRazaosocial("Java 12");
      //repository.save(a1);
      
      //repository.findAll()
      //repository.findById(id)

      //Pedido p = new Pedido();
      //p.setCliente(a1);
      //p.setDescricao("Pedido feito em aula");

      //p.getCliente().getNomefantasia()

      //pedidoRepository.save(p);

       for (Cliente cli: repository.findAll() ) {
          System.out.println("Cliente -> " + cli.getRazaosocial() );
          //cli.getPedidos()
       }
    }

    public ClienteRepository getRepository() {
       return repository;
    }

    public void setRepository(ClienteRepository repository) {
       this.repository = repository;
    }

    public PedidoRepository getPedidoRepository() {
       return pedidoRepository;
    }

    public void setPedidoRepository(PedidoRepository pedidoRepository) {
       this.pedidoRepository = pedidoRepository;
    }
}
