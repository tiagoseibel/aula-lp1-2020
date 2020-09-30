package com.example.aula04;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named(value = "calcBean") 
@SessionScoped
public class CalculadoraBean {
   private Double valor1 = 0.0;
   private Double valor2 = 0.0;
   private Double resultado = 0.0;

   private List<Valores> lista = new ArrayList<>();

   public void calcular() {
      this.resultado = this.valor1 + this.valor2;
      
      Valores v = new Valores();
      v.setValor1(valor1);
      v.setValor2(valor2);
      v.setResultado(resultado);

      this.lista.add(v);
   }

   public Double getValor1() {
      return valor1;
   }

   public void setValor1(Double valor1) {
      this.valor1 = valor1;
   }

   public Double getValor2() {
      return valor2;
   }

   public void setValor2(Double valor2) {
      this.valor2 = valor2;
   }

   public Double getResultado() {
      return resultado;
   }

   public void setResultado(Double resultado) {
      this.resultado = resultado;
   }

   public List<Valores> getLista() {
      return lista;
   }

   public void setLista(List<Valores> lista) {
      this.lista = lista;
   }
}
