package org.example.reservas;

import org.example.User;

public class Hotel extends Reserva {
    private int numeroHabitaciones;
    private int numeroHuespedes;

    public Hotel(User user, String pago, int numeroHabitaciones, int numeroHuespedes) {
        super(user, pago);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroHuespedes = numeroHuespedes;
    }

    @Override
    public void escogerMetodoDePago() {
        super.escogerMetodoDePago();
    }
@Override
    public void mostrarInformacion(){
        System.out.println("Su reserva de hotel con " + numeroHabitaciones + " habitaciones para "+ numeroHuespedes + " huespedes, se ha realizado satisfactoriamente");
    }
}
