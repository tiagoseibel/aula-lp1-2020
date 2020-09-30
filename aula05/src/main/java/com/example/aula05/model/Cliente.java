package com.example.aula05.model;

import java.time.LocalDate;
// POJO -> Plan Old Java Object
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes") // opcional
public class Cliente {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY) // -> opc
   private Integer id;
   private String razaosocial;
   private String nomefantasia;
   private String cnpj;
   private String endereco;
   private LocalDate datafundacao;
   
   @OneToMany(mappedBy = "cliente")
   private List<Pedido> pedidos;

   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getRazaosocial() {
      return razaosocial;
   }

   public void setRazaosocial(String razaosocial) {
      this.razaosocial = razaosocial;
   }

   public String getNomefantasia() {
      return nomefantasia;
   }

   public void setNomefantasia(String nomefantasia) {
      this.nomefantasia = nomefantasia;
   }

   public String getCnpj() {
      return cnpj;
   }

   public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
   }

   public String getEndereco() {
      return endereco;
   }

   public void setEndereco(String endereco) {
      this.endereco = endereco;
   }

   public LocalDate getDatafundacao() {
      return datafundacao;
   }

   public void setDatafundacao(LocalDate datafundacao) {
      this.datafundacao = datafundacao;
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      Cliente other = (Cliente) obj;
      if (id == null) {
         if (other.id != null)
            return false;
      } else if (!id.equals(other.id))
         return false;
      return true;
   }

   public List<Pedido> getPedidos() {
      return pedidos;
   }

   public void setPedidos(List<Pedido> pedidos) {
      this.pedidos = pedidos;
   }

   
}
