package br.com.alan.store.repository;

import br.com.alan.store.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    //Optional<Tarefa> findByTituloContainingIgnoreCase(String nomeSerie);
}
