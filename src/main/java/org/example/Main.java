package org.example;

import org.example.reservas.CitaMedica;
import org.example.reservas.Hotel;
import org.example.reservas.Restaurante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------ Cita Medica ------------------------------");
        User user= new User("Maria", "1023666554", 3215876);
        CitaMedica citaMedica = new CitaMedica(user, "tarjeta", true, "General");
        citaMedica.mostrarSiRecibeBeneficios();
        citaMedica.solicitarCita();
        citaMedica.escogerMetodoDePago();
        citaMedica.getFechaReservaa();
        citaMedica.mostrarInformacion();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Seleccione el tipo de cita:");
//        System.out.println("1. Cita Medico General");
//        System.out.println("2. Cita con Especialista");
//        System.out.println("3. Cita de Odontología");
//         int option = sc.nextInt();
//         CitaMedica.TipoCita seleccion = null;
//
//        switch (option){
//            case 1: seleccion = CitaMedica.TipoCita.GENERAL;
//            break;
//            case 2: seleccion = CitaMedica.TipoCita.ESPECIALISTA;
//            break;
//            case 3: seleccion = CitaMedica.TipoCita.ODONTOLOGIA;
//            break;
//            default:
//                System.out.println("Selecciona una opcion valida");
//        }
//        citaMedica.solicitarCita(seleccion);

        System.out.println("----------------------------- Reserva Hotel -----------------------------");
        Hotel hotel = new Hotel(user, "efectivo", 2, 2);
        hotel.escogerMetodoDePago();
        hotel.mostrarInformacion();
        hotel.getFechaReservaa();

        System.out.println("--------------------------- Reserva Restaurante ---------------------------");
        Restaurante restaurante = new Restaurante(user, "tarjeta", "Monapizza", 3);
        restaurante.escogerMetodoDePago();
        restaurante.mostrarInformacion();
        hotel.getFechaReservaa();














    }
}