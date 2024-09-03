package br.com.alan.store.model;

public enum SituacaoTarefa {
    PENDENTE,
    CANCELADA,
    FINALIZADA,
    PAUSADA,
    EM_ANDAMENTO;

    private String tarefa;

    public static SituacaoTarefa validaTarefa(String text) {
        for (SituacaoTarefa situacaoTarefa : SituacaoTarefa.values()) {
            if (situacaoTarefa.tarefa.equalsIgnoreCase(text)){
                return situacaoTarefa;
            }
        }
        throw new IllegalArgumentException("Nenhuma tarefa encontrada! ");
    }
}
