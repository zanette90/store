package br.com.alan.store.model;

import br.com.alan.store.repository.TarefaRepository;
import jakarta.persistence.*;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Entity
@Table(name="task")
public class Tarefa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTarefa;
    private String descricaoTarefa;
    private LocalDate prazo;
    @Enumerated(EnumType.STRING)
    private PrioridadeTarefa prioridade;
    public LocalDate dataDeSolitacao;
    private LocalDate dataDeInicio;
    private LocalDate dataDeFinalizacao;
    @Enumerated(EnumType.STRING)
    private SituacaoTarefa situacao;
    private String responsavel;
    private LocalDate dataDeCancelamento;
    private LocalDate dataDeParada;
    @Transient
    private TarefaRepository tarefaRepositorio;
    private LocalTime horasConsumidas;
    private LocalTime horaInicio;
    private LocalTime horaFim;

    public Tarefa() {
    }
    public Tarefa(String descricaoTarefa, LocalDate prazo, TarefaRepository repositorio) {
        this.descricaoTarefa = descricaoTarefa;
        this.prazo = prazo;
        this.dataDeSolitacao = LocalDate.now();
        this.situacao = SituacaoTarefa.PENDENTE;
        this.tarefaRepositorio = tarefaRepositorio;
    }

    public void setDataDeInicio() {
        this.situacao = SituacaoTarefa.EM_ANDAMENTO;
        this.dataDeInicio = LocalDate.now();
    }

    public void setDataDeFinalizacao(LocalDate dataDeFinalizacao) {
        this.situacao = SituacaoTarefa.FINALIZADA;
        this.dataDeFinalizacao = dataDeFinalizacao;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public long getIdTarefa() {
        return idTarefa;
    }

    public String getDescricaoTarefa() {
        return descricaoTarefa;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public LocalDate getDataDeSolitacao() {
        return dataDeSolitacao;
    }

    public LocalDate getDataDeInicio() {
        return dataDeInicio;
    }

    public LocalDate getDataDeFinalizacao() {
        return dataDeFinalizacao;
    }

    public SituacaoTarefa getSituacao() {
        return situacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricaoTarefa = descricaoTarefa;
    }

    public void setSituacao(SituacaoTarefa situacao) {
        this.situacao = situacao;
    }

    public void setResponsavel(@NotNull Usuario res) {
        this.responsavel = res.getNome();
    }

    public LocalDate getDataDeCancelamento() {
        return dataDeCancelamento;
    }

    public void setDataDeCancelamento(LocalDate dataDeCancelamento) {
        this.situacao = SituacaoTarefa.CANCELADA;
        this.dataDeCancelamento = LocalDate.now();
    }
    public void setDataDeParada(LocalDate dataDeParada) {
        this.situacao = SituacaoTarefa.PAUSADA;
        this.dataDeParada = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricaoTarefa='" + descricaoTarefa + '\'' +
                ", prazo=" + prazo +
                ", dataDeSolitacao=" + dataDeSolitacao +
                ", dataDeInicio=" + dataDeInicio +
                ", dataDeFinalizacao=" + dataDeFinalizacao +
                ", situacao=" + situacao +
                ", responsavel='" + responsavel + '\'' +
                ", dataDeCancelamento=" + dataDeCancelamento +
                ", dataDeParada=" + dataDeParada +
                ", horasConsumidas=" + horasConsumidas +
                ", horaInicio=" + horaInicio +
                ", horaFim=" + horaFim +
                '}';
    }
}
