package br.com.ienh.appsextou.sextou.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ienh.appsextou.sextou.entities.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, Integer> {
    
}
