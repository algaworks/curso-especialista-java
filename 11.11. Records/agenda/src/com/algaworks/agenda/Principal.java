package com.algaworks.agenda;

public class Principal {

    public static void main(String[] args) {
        Horario horario = new Horario(10, 30);

        Agendamento agendamentoCabelo = new Agendamento(horario, "Corte de cabelo");
        agendamentoCabelo.setHorario(new Horario(16, 20));

        System.out.println(agendamentoCabelo.getHorarioFormatado());
    }

}
