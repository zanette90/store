package br.com.alan.store.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.br.CPF;

public record UsuarioDto(long id,
                         String nome,
                         String email,
                         String cpf,
                         String endereco) {

}
