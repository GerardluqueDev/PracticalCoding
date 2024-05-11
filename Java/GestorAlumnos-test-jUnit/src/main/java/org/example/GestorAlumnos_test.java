package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class GestorAlumnos_test {

    @Test
    public void agregarAlumnos_test(){

        GestorAlumnos ga = new GestorAlumnos();
        assertEquals(0,ga.getListaAlumnos().size());
        ga.agregarAlumnos("Juan");
        assertTrue(ga.getListaAlumnos().contains("Juan"));
        assertEquals("Juan",ga.getListaAlumnos().get(0));
        assertEquals(1,ga.getListaAlumnos().size());
        assertFalse(ga.getListaAlumnos().contains(null));
        assertTrue(ga.getListaAlumnos().contains("Rita"));

    }


    @Test
    public void eliminarAlumnos_test(){

        GestorAlumnos ga = new GestorAlumnos();
        ga.agregarAlumnos("Pepe");
        assertTrue(ga.eliminarAlumnos("Pepe"));
        assertFalse(ga.eliminarAlumnos("Juan"));
        assertFalse(ga.getListaAlumnos().contains("Pepe"));
        ga.eliminarAlumnos("Pepe");
        assertFalse(ga.getListaAlumnos().contains("Pepe"));
        assertEquals(0,ga.getListaAlumnos().size());

    }

    @Test
    public void cantidadAlumnos_test(){

        GestorAlumnos ga = new GestorAlumnos();
        ga.agregarAlumnos("Pepe");
        ga.agregarAlumnos("Juan");
        ga.agregarAlumnos("María");
        ga.agregarAlumnos("Julia");
        ga.agregarAlumnos("Ana");

        assertEquals(5,ga.cantidadAlumnos());
        assertFalse(ga.cantidadAlumnos() == 0);
        assertTrue(ga.cantidadAlumnos() == 5);

        ga.eliminarAlumnos("Julia");

        assertEquals(4,ga.cantidadAlumnos());
        assertTrue(ga.cantidadAlumnos() == 4);

    }

    @Test
    public void buscarAlumnos_test(){
        GestorAlumnos ga = new GestorAlumnos();
        ga.agregarAlumnos("Pepe");
        ga.agregarAlumnos("Juan");
        ga.agregarAlumnos("María");
        ga.agregarAlumnos("Julia");
        ga.agregarAlumnos("Ana");

        assertTrue(ga.buscarAlumnos("Pepe"));
        assertFalse(ga.buscarAlumnos("Alejandro"));

    }

}
