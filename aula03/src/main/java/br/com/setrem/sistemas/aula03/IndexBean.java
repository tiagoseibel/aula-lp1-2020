package br.com.setrem.sistemas.aula03;

import javax.enterprise.context.RequestScoped;

@Named(value = "indexBean")
@RequestScoped
public class IndexBean {
   private String nome = "Nome 123";

   public void btnClick(){
      System.out.println("Clicou!");
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }
}