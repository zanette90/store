package br.com.alan.store.controller;

import br.com.alan.store.model.Tarefa;
import br.com.alan.store.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping("/tarefa")
    public List<Tarefa> obterTarefa() {
        return tarefaRepository.findAll();
    }
}


