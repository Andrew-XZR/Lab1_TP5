package com.ulp.lab1_tp5;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DirectorioTelefonico {

    public static void main(String[] args) {
        private final TreeMap<Long, Contacto> contactos;

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
    
    public Contacto buscarContacto(Long telefono) {
        return contactos.get(telefono);
    }
    
    public Set<Long> buscarTelefono(String apellido) {
        Set<Long> telefonos = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : contactos.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }
}
