package com.apiprojetsalle.reservationsalle.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.apiprojetsalle.reservationsalle.serviceImpl.InitialisationSercice;

@RestController
public class InitialisationController {
	
	@Autowired
	private InitialisationSercice initialisationSercice;
	
//	@PostConstruct
//	public void initialisation () {
//		initialisationSercice.initialisation();
//	}

}
