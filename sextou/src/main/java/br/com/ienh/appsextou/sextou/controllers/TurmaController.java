package br.com.ienh.appsextou.sextou.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/turma")
public class TurmaController {

    @GetMapping("/mostrarTodas")
    public String mostrarTodas() {
        return "turma/mostrarTodas";
    }
}
