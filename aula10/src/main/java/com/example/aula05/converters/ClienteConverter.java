package com.example.aula05.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import com.example.aula05.model.Cliente;
import com.example.aula05.repository.ClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClienteConverter implements Converter {

   @Autowired
   private ClienteRepository repository;

   @Override
   public Object getAsObject(FacesContext context, UIComponent component, String value) {
      Cliente cliente = repository.findById( Integer.valueOf(value) ).get();
      
      return cliente;
   }

   @Override
   public String getAsString(FacesContext context, UIComponent component, Object value) {
      return ( (Cliente) value ).getId().toString();
   }
   
}
