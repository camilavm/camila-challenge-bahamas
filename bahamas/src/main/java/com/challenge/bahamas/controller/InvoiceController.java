package com.challenge.bahamas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.bahamas.model.Invoice;
import com.challenge.bahamas.repository.InvoiceRepository;

@RestController
public class InvoiceController {

	@Autowired
	private InvoiceRepository invoiceRepository;
	
	@GetMapping("retrieve-invoices")
	private List<Invoice> retrieveInvoices() {
		return invoiceRepository.findAll();
	}
	
	@PostMapping("create-invoice")
	@ResponseStatus(HttpStatus.CREATED)
	private Invoice createInvoice(@RequestBody Invoice invoice) {
		return invoiceRepository.save(invoice);
	}
	
	@GetMapping("/retrieve-bahamas-client/{invoice_id}")
	public Optional<Invoice> retrieveClientsFromInvoice(@PathVariable("invoice_id") Long invoiceId) {
		return invoiceRepository.findById(invoiceId);
	}
}
