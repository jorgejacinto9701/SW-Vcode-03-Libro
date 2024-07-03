package com.centroinformacion.libro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.libro.entity.Ejemplo;
import com.centroinformacion.libro.repository.EjemploRepository;

@Service
public class EjemploServiceImp implements EjemploService {

	@Autowired	
	private EjemploRepository repository;

	@Override
	public Ejemplo insertaActualizaEjemplo(Ejemplo obj) {
		return repository.save(obj);
	}
	
	@Override
	public List<Ejemplo> listaEjemplo() {
		return repository.findAll();
	}
	
}
