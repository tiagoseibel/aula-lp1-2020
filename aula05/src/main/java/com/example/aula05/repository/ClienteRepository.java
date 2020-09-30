package com.example.aula05.repository;

import java.util.List;

import com.example.aula05.model.Cliente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository 
   extends JpaRepository<Cliente, Integer> {
   
   public Cliente findByCnpj(String cnpj);
   public List<Cliente> findByRazaosocial(String razaosocial);

   //findByLastnameOrderByFirstnameAsc
   //findByLastnameIgnoreCase

   @Query("select c from Cliente c where upper(c.nomefantasia) like upper(?1)")
   public List<Cliente> findPersonalizado(String nome);

   // @Query(name = "dfadfa", nativeQuery = true)
   // public List<Cliente> findPersonalizado(String nome);

}
