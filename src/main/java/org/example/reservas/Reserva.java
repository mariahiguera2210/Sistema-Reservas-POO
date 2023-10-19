package org.example.reservas;
import org.example.User;
import java.time.LocalDateTime;

public abstract class Reserva {

    User user;
    LocalDateTime fechaReservaa;

    private String pago;

    public Reserva(User user, String pago) {
        this.user =user;
        this.pago= pago;
        this.fechaReservaa = LocalDateTime.now();
    }

    public abstract void mostrarInformacion();
    public LocalDateTime getFechaReservaa() {
        System.out.println("Fecha de la reserva: " + fechaReservaa);
        return null;
    }

    public void escogerMetodoDePago(){
        switch (pago.toLowerCase()) {
            case "tarjeta" -> System.out.println("Vas a pagar con Tarjeta");
            case "efectivo" -> System.out.println("Vas a pagar en Efectivo");
        }
    }


}

