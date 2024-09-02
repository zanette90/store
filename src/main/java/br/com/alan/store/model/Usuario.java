package br.com.alan.store.model;

import br.com.alan.store.repository.UsuarioRepository;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.hibernate.id.factory.internal.AutoGenerationTypeStrategy;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;

@Entity
@Table(name = "Users")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    @Column
    private String nome;
    @Column
    @Email
    private String email;
    @Column
    @CPF
    private String cpf;
    @Column
    private String endereco;
    @Column
    private String senha;
    @Transient
    private UsuarioRepository repository;

    public Usuario() {

    }
    public Usuario(String nome, String email, String cpf, String endereco, String senha, UsuarioRepository repositorio) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.endereco = endereco;
        this.senha = senha;
        this.repository = repositorio;
    }
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getSenha() {
        return senha;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void listarUsuario(){
        List<Usuario> usuarios = repository.findAll();
        for (Usuario u : usuarios){
            System.out.println(u.toString());
        }
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}
