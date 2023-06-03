package br.com.ienh.appsextou.sextou.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ienh.appsextou.sextou.entities.Contato;

public interface ContatoRepository extends CrudRepository<Contato, Integer> {
    
}
