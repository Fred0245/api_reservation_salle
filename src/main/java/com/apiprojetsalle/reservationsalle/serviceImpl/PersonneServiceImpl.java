package com.apiprojetsalle.reservationsalle.serviceImpl;

import com.apiprojetsalle.reservationsalle.model.DonneesLogin;
import com.apiprojetsalle.reservationsalle.model.Personne;
import com.apiprojetsalle.reservationsalle.repository.PersonneRepository;
import com.apiprojetsalle.reservationsalle.service.PersonneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonneServiceImpl implements PersonneService {

    @Autowired
    public PersonneRepository personneRepository;

    @Override
    public List<Personne> getAll() {
        return this.personneRepository.findAll();
    }

    @Override
    public Personne findById(Long id) {
    	
        Personne personne= this.personneRepository.findById(id).orElse(null);
        
        if(personne != null) {
        	return personne;
        }else {
        	return new Personne();
        }
    }

    @Override
    public Personne save(Personne personne) {
        return this.personneRepository.save(personne);
    }

    @Override
    public Personne update(Personne personne) {
        return this.personneRepository.save(personne);
    }

    @Override
    public void deleteById(Long id) {
        this.personneRepository.deleteById(id);
    }
    
    @Override
    public Personne authentifier(DonneesLogin donneesLogin) {
    	
    	
    	if(donneesLogin.getUsername() != null) {
    		
    		Personne personne = this.personneRepository.findByUsername(donneesLogin.getUsername());
    		
    		if(personne != null) {
    			
    			if(personne.getPassword().equals(donneesLogin.getPassword())) {
        			System.out.println("accés ok");
        			
        			return personne;
        		}else {
        			System.out.println("password incorrect");
        			System.out.println(donneesLogin.getPassword() + " "+ personne.getPassword());
        			return new Personne();
        		}
    			
    		}else {
    			
    			return new Personne();
    			
    		}
    		
    		
    	}else {
    		return new Personne();
    	}
        
    	
    }
}
