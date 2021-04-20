package com.qbo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.qbo.model.Persona;

@Service
public class PersonaService {
	
	public List<Persona> lstpersonas = new ArrayList<Persona>();
	
	public PersonaService() {
		lstpersonas.add(new Persona(1, "Hugo Vargas", 22));
		lstpersonas.add(new Persona(2, "Felipe Tello", 21));
		lstpersonas.add(new Persona(3, "Hugo Pizarro", 25));
		lstpersonas.add(new Persona(4, "Hugo Braulio", 20));
		lstpersonas.add(new Persona(5, "Hugo Quispe", 42));
		}
	
	public List<Persona> listarPersonas(){
		return lstpersonas;
	}
	
	public Optional<Persona> buscarPorId(Integer id){
		for(Persona persona: lstpersonas) {
			if(persona.getId().equals(id)) {
				return Optional.of(new Persona(
						persona.getId(), persona.getNombre(), 
						persona.getEdad()));
			}
		}
		return Optional.empty();
	}
	
	public Persona registrarPersona(Persona persona) {
		lstpersonas.add(persona);
		return persona;
	}
	
	public Persona eliminarPersona(Persona persona) {
		lstpersonas.remove(persona);
		return persona;
	}
	
	public void eliminarTodosPersona() {
		lstpersonas.removeAll(lstpersonas);
	}

}
