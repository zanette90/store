package br.com.alan.store.repository;

import br.com.alan.store.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
