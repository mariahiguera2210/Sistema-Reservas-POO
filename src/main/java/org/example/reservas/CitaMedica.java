package org.example.reservas;

import org.example.User;

import java.time.LocalDateTime;


public class CitaMedica extends Reserva implements CitraPrioritaria {

    private boolean pagaMedicianPrepagada;
    private String tipoDeCita;

    public CitaMedica(User user, String pago, boolean pagaMedicianPrepagada, String tipoDeCita) {
        super(user, pago);
        this.pagaMedicianPrepagada = pagaMedicianPrepagada;
        this.tipoDeCita = tipoDeCita;
    }

//    public enum TipoCita{
//        GENERAL,
//        ESPECIALISTA,
//        ODONTOLOGO
//    }

    public void solicitarCita() {

        switch (tipoDeCita.toLowerCase()){
            case "general" -> System.out.println("Haz solicitado cita con medico General");
            case "especialista" -> System.out.println("Haz solicitado cita con Especialista ");
            case "odontolog" -> System.out.println("Haz solicitado cita con Odontologo ");
            default -> System.out.println("Ingresa un tipo de cita valido");

        }
    }

    @Override
    public LocalDateTime getFechaReservaa() {
        return super.getFechaReservaa();
    }

    public boolean isPagaMedicianPrepagada(){return pagaMedicianPrepagada; }

    @Override
    public void mostrarSiRecibeBeneficios() {
        if(isPagaMedicianPrepagada())
            System.out.println("Tiene derecho a beneficios adicionales en plan de Salud ");
        else
            System.out.println("No tiene beneficios adicionales en plan de Salud ");
    }

    @Override
    public void escogerMetodoDePago() {
        super.escogerMetodoDePago();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Su cita medica se a agendado satisfactoriamente");
    }
}
