package br.com.alan.store;

import br.com.alan.store.model.*;
import br.com.alan.store.repository.TarefaRepository;
import br.com.alan.store.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootApplication
public class StoreApplication implements CommandLineRunner {
	@Autowired
	private UsuarioRepository uRepositorio;
	@Autowired
	private TarefaRepository tRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(StoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LocalDate prazo = LocalDate.parse("2024-09-11");
		Menu menu = new Menu();

		Tarefa tarefa = new Tarefa("Corrigir bugs", prazo, tRepositorio);
		//tRepositorio.save(tarefa);

		Usuario usuario = new Usuario("Alan","alan.stefenon@hotmail.com","02737149029","Rua tal","123",uRepositorio);
		//uRepositorio.save(usuario);
		listarUsuario();
		listarTarefa();
	}
	public void listarUsuario() {
		List<Usuario> usuarioList = new ArrayList<>();
		usuarioList = uRepositorio.findAll();
		usuarioList.stream()
				.sorted(Comparator.comparing(Usuario::getId))
				.forEach(System.out::println);
	}

	public void listarTarefa() {
		List<Tarefa> tarefaList = new ArrayList<>();
		tarefaList = tRepositorio.findAll();
		tarefaList.stream()
				.sorted(Comparator.comparing(Tarefa::getIdTarefa))
				.forEach(System.out::println);
	}

}
