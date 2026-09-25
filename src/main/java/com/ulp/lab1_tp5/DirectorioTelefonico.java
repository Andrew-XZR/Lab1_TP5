package com.ulp.lab1_tp5;

import java.util.TreeMap;

public class DirectorioTelefonico {

    public static void main(String[] args) {
        private TreeMap<Long, Contacto> contactos;

    public DirectorioTelefonico() {
        this.contactos = new TreeMap<>();
    }
    
    public void agregarContacto(Long telefono, Contacto contacto) {
        if ( telefono == null && contacto == null)
            throw new IllegalArgumentException("Teléfono y contacto no pueden ser nulos");
        
        if (contactos.containsKey(telefono)) {
            System.out.println("Ya existe un contacto con el teléfono " + telefono);
            return;
        }
        
        contactos.put(telefono, contacto);
    }
}
