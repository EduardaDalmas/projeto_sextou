package br.com.ienh.appsextou.sextou.controllers;

import java.util.Optional;

import javax.print.DocFlavor.STRING;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.ienh.appsextou.sextou.entities.Professor;
import br.com.ienh.appsextou.sextou.repositories.ProfessorRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/professor")
public class ProfessorController {

    @Autowired
    ProfessorRepository professorRepository;
    
    @GetMapping("/listar")
    public String listar(Model model) {
        Iterable<Professor> professores = professorRepository.findAll();
        model.addAttribute("professores", professores);
        return "professor/listar";
    }

    @GetMapping("/novo")
    public String novo(Professor professor) {
        return "/professor/novo";
    }

    @PostMapping("/salvar")
    public String insere(@Valid Professor professor, BindingResult result) {
        if(result.hasErrors() == true) {
            return "professor/novo";
        }
        professorRepository.save(professor);
        return "redirect:/professor/listar";
    }

    @GetMapping("/remover/{id}")
    public String remover(@PathVariable("id") int id) {
        Optional<Professor> professor = professorRepository.findById(id);
        professorRepository.delete(professor.orElse(null));
        return "redirect:/professor/listar";
    }

    @GetMapping("/alterar/{id}")
    public String alterar(@PathVariable("id") int id, Model model) {
        Optional<Professor> professor = professorRepository.findById(id);
        model.addAttribute("professor", professor.orElse(null));
        return "professor/alterar";
    }

    @GetMapping("/teste")
    public String teste(@RequestParam int id, @RequestParam String nome) {
        System.out.println(id);
        System.out.println(nome);
        return "professor/teste";
    }

    @GetMapping("/teste2")
    public String teste2(@RequestParam String nome, Model model) {
        model.addAttribute("nome", nome);
        return "teste2";
    }

    @GetMapping("/teste3/{id}/{nome}")
    public String teste3(@PathVariable int id, @PathVariable String nome, Model model) {
        model.addAttribute("nome", nome);
        model.addAttribute("id", id);
        System.out.println(id);
        System.out.println(nome);
        return "teste3";
    }

}
