package com.challenge.bahamas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.bahamas.model.Client;
import com.challenge.bahamas.repository.ClientRepository;

@RestController
public class ClientController {

	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/retrieve-bahamas-client")
	public List<Client> retrieveClientsFromInvoice() {
		return clientRepository.findAll();
	}
	
	@PostMapping("/store-bahamas-client")
	@ResponseStatus(HttpStatus.CREATED)
	public Client storeClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
}
