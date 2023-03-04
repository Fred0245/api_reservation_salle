package com.apiprojetsalle.reservationsalle.serviceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiprojetsalle.reservationsalle.model.Administrateur;
import com.apiprojetsalle.reservationsalle.model.Client;
import com.apiprojetsalle.reservationsalle.model.Responsable;
import com.apiprojetsalle.reservationsalle.model.Salle;
import com.apiprojetsalle.reservationsalle.repository.PersonneRepository;
import com.apiprojetsalle.reservationsalle.repository.SalleRepository;




@Service
public class InitialisationSercice {
	
	@Autowired
	private PersonneRepository personneRepository;
	
	@Autowired
	private SalleRepository salleRepository;
	
	
	public void initialisation () {
		
		 Responsable responsable = new Responsable();
		 responsable.setNom("BHOUD");
		 responsable.setPrenom("Sévérin");
		 responsable.setUsername("responsable");
		 responsable.setEmail("responsable@gmail.com");
		 responsable.setPassword("1234");
		 responsable.setTelephone("90451623");
	
		 personneRepository.save(responsable);
		 
		 Administrateur administrateur = new Administrateur();
		 administrateur.setNom("FAYA");
		 administrateur.setPrenom("Majoie");
		 administrateur.setUsername("admin");
		 administrateur.setEmail("admine@gmail.com");
		 administrateur.setPassword("1234");
		 administrateur.setTelephone("70451246");
	
		 personneRepository.save(administrateur);
		 

		 
		 Client client = new Client();
		 client.setNom("ALI");
		 client.setPrenom("Parfait");
		 client.setUsername("client");
		 client.setEmail("cliente@gmail.com");
		 client.setPassword("1234");
		 client.setTelephone("7845136");
	
		 personneRepository.save(client);
		 
		 Salle salle = new Salle ();
		 salle.setCapacite(15);
		 salle.setMatricule("001");
		 salle.setNom("R6");
		 salle.setPrix(800000.0);
		 salle.setPhoto("img1.jpg");
		 salle.setStatut(true);
		 salle.setResponsable(responsable);
		 
		 salleRepository.save(salle);
		 
		 
		
	}
	
	

}
