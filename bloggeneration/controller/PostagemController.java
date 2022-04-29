package com.generation.bloggeneration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.bloggeneration.model.Postagem;
import com.generation.bloggeneration.repository.PostagemRepository;


@RestController
@RequestMapping ("/Postagem")
@CrossOrigin ("*")
public class PostagemController {
	
	@Autowired
	private PostagemRepository repository;
	
	@GetMapping
	public ResponseEntity <List<Postagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
		
	
	
	}
}
