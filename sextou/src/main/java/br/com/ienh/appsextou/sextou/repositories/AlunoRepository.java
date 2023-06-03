package br.com.ienh.appsextou.sextou.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.ienh.appsextou.sextou.entities.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Integer> {
    
}
