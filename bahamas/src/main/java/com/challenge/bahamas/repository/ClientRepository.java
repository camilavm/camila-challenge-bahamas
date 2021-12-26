package com.challenge.bahamas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.challenge.bahamas.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
