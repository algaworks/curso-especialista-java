package com.algaworks.agenda;

public class Agendamento {

    private Horario horario;
    private String descricao;

    public Agendamento(Horario horario, String descricao) {
        this.horario = horario;
        this.descricao = descricao;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getHorarioFormatado() {
        return horario.formatar();
    }

}
