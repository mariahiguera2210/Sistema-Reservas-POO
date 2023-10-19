package org.example.reservas;

import org.example.User;


public class Restaurante extends Reserva {


    private String nombreRestaurante;
    private int numeroPersonas;

    public Restaurante(User user, String pago, String nombreRestaurante, int numeroPersonas) {
        super(user, pago);
        this.numeroPersonas = numeroPersonas;
        this.nombreRestaurante= nombreRestaurante;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    @Override
    public void escogerMetodoDePago() {
        super.escogerMetodoDePago();
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Su reserva en el restaurante " + getNombreRestaurante() + " para " + getNumeroPersonas() + " personas se ha realizado satisfactoriamente ");
    }
}
