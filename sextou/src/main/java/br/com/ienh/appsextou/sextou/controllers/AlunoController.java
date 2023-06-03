package br.com.ienh.appsextou.sextou.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.ienh.appsextou.sextou.entities.Aluno;
import br.com.ienh.appsextou.sextou.repositories.AlunoRepository;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @Autowired
    AlunoRepository alunoRepository;

    @GetMapping("/olaMundo")
    public String olaMundo() {
        return "ola";
    }

    @GetMapping("/sextou")
    public String sextou() {
        return "sextou";
    }

    @GetMapping("/olaMundo2")
    public String olaMundo2() {
        return "ola/ola2";
    }

    @GetMapping("/mostrarTodos")
    public String mostrarTodos(Model model) {
        Iterable<Aluno> alunos = alunoRepository.findAll();
        model.addAttribute("alunos", alunos);
        return "aluno/mostrarTodos";
    }

    @GetMapping("/alunoPorId/{id}")
    public String alunoPorId(@PathVariable int id, Model model) {
        Aluno aluno = alunoRepository.findById(id).get();
        model.addAttribute("aluno", aluno);
        return "aluno/alunoPorId";
    }
}
