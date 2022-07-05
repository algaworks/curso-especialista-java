package com.algaworks.agenda;

public class CalculadoraHorario {

    private CalculadoraHorario() {
    }

    public static Horario somarDuasHoras(Horario horario) {
        int hora = horario.getHora() + 2;

        if (hora > 24) {
            hora = hora - 24;
        }

//        horario.setHora(hora);
//        return horario;

        return new Horario(hora, horario.getMinuto());
    }

}
