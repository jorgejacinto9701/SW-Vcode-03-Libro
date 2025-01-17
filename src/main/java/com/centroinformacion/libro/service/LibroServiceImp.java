package com.centroinformacion.libro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.centroinformacion.libro.entity.Libro;
import com.centroinformacion.libro.repository.LibroRepository;

@Service
public class LibroServiceImp implements LibroService{
	
	@Autowired
	private LibroRepository repository;

	@Override
	public List<Libro> listaLibro() {
		
		return repository.findAll();
	}

	@Override
	public Libro insertarLibro(Libro obj) {
		
		return repository.save(obj);
	}

}
