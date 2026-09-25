package com.ulp.lab1_tp5;

import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("*** PRUEBAS DEL DIRECTORIO TELEFÓNICO ***\n");

        DirectorioTelefonico directorio = new DirectorioTelefonico();

        // ---- Prueba A: agregarContacto ----
        System.out.println("--- A. Agregando contactos ---");
        directorio.agregarContacto(1122334455L,
            new Contacto("30111222", "Juan", "Pérez", "San Luis", "Av. Corrientes 123"));
        directorio.agregarContacto(1155667788L,
            new Contacto("28999888", "María", "Gómez", "Córdoba", "San Martín 456"));
        directorio.agregarContacto(1144556677L,
            new Contacto("27444555", "Pedro", "Pérez", "Rosario", "Mitre 789"));
        directorio.agregarContacto(1133445566L,
            new Contacto("31222333", "Lucía", "Fernández", "Buenos Aires", "Belgrano 321"));

        directorio.mostrarDirectorio();

        // ---- Prueba B: buscarContacto ----
        System.out.println("\n--- B. Buscar contacto por teléfono 1155667788 ---");
        Contacto encontrado = directorio.buscarContacto(1155667788L);
        System.out.println(encontrado != null ? encontrado : "No encontrado");

        System.out.println("\n--- B. Buscar contacto inexistente 9999999999 ---");
        Contacto noEncontrado = directorio.buscarContacto(9999999999L);
        System.out.println(noEncontrado != null ? noEncontrado : "No encontrado");

        // ---- Prueba C: buscarTelefono por apellido ----
        System.out.println("\n--- C. Teléfonos de 'Pérez' ---");
        Set<Long> telsPerez = directorio.buscarTelefono("Pérez");
        System.out.println(telsPerez.isEmpty() ? "Sin resultados" : telsPerez);

        System.out.println("\n--- C. Teléfonos de 'Gómez' ---");
        System.out.println(directorio.buscarTelefono("Gómez"));

        System.out.println("\n--- C. Teléfonos de 'Inexistente' ---");
        System.out.println(directorio.buscarTelefono("Inexistente"));

        // ---- Prueba D: buscarContactos por ciudad ----
        System.out.println("\n--- D. Contactos en 'San Luis' ---");
        ArrayList<Contacto> contactosBA = directorio.buscarContactos("San Luis");
        contactosBA.forEach(System.out::println);

        System.out.println("\n--- D. Contactos en 'Rosario' ---");
        directorio.buscarContactos("Rosario").forEach(System.out::println);

        System.out.println("\n*** FIN DE LAS PRUEBAS ***");
    }
}