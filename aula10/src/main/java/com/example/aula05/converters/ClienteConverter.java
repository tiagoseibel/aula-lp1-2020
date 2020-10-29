package com.example.aula05.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import com.example.aula05.model.Cliente;

import org.springframework.stereotype.Component;

@Component
public class ClienteConverter implements Converter {

   @Override
   public Object getAsObject(FacesContext context, UIComponent component, String value) {
      Cliente cliente = new Cliente();
      cliente.setId( Integer.parseInt(value) );
      return cliente;
   }

   @Override
   public String getAsString(FacesContext context, UIComponent component, Object value) {
      return ( (Cliente) value ).getId().toString();
   }
   
}
