package br.com.alan.store.controller;

import br.com.alan.store.dto.UsuarioDto;
import br.com.alan.store.model.Usuario;
import br.com.alan.store.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepositorio;

    @GetMapping("/usuario")
    public List<UsuarioDto> obterUsuario() {
        return usuarioRepositorio.findAll()
                .stream()
                .map(s -> new UsuarioDto(s.getId(), s.getNome(), s.getEmail(), s.getCpf(), s.getEndereco()))
                .collect(Collectors.toList());
    }

    @GetMapping()
    public String inicio(){
        return "Bem vindos ao gerenciador de ordem de serviço";
    }



}
