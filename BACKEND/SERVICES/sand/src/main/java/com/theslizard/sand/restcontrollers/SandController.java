package com.theslizard.sand.restcontrollers;

import org.springframework.web.bind.annotation.RestController;

//import com.theslizard.sand.dao.JournalDAO;
import com.theslizard.sand.dao.SandRepository;
import com.theslizard.sand.persistence.Journal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class SandController {

		@Autowired SandRepository sandRepository;
	
	    @RequestMapping("/hello")
	    public String index() {
	        return "Threads of SAND !!";
	    }

	    @RequestMapping("/addHelloEntry")
	    public ResponseEntity<Journal> addToJournal() {
	    	 
	    	 //JournalDAO journalDao = new JournalDAO();
	         Journal journal = new Journal();
	         
	         journal.setTitle("Hello");
	         journal.setKeywords("Sand World");
	         
	         return new ResponseEntity<Journal>(
	        		 sandRepository.save(journal), HttpStatus.OK);
	         //return sandRepository.save(journal);
	         
	    }
	    
	}
	

