package com.challenge.bahamas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.bahamas.model.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long>{

}
