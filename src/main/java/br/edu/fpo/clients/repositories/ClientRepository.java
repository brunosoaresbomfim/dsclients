package br.edu.fpo.clients.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.fpo.clients.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
