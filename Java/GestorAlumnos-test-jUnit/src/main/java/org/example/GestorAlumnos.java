package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un gestor de alumnos con un listado de sus nombre
 *
 * Esta clase proporciona métodos para agregar alumnos, eliminar alumnos,
 * ver la cantidad de alumnos, buscar alumnos y obtener el listado completo de alumnos
 *
 * @author Gerard Luque
 * @version 1.0
 */
public class GestorAlumnos {

    private List<String> listaAlumnos;

    /**
     * Constructor de la clase GestorAlumnos, crea un ArrayList.
     */
    public GestorAlumnos() {
        this.listaAlumnos = new ArrayList<>();
    }

    /**
     * Método que agrega alumnos a la lista. Si el alumno se ha agregado correctamente nos muestra un mensaje de
     * confirmación, en caso contrario nos muestra el mensaje de la excepción y nos informa de que no
     * se ha podido agregar.
     *
     * @author Gerard Luque
     * @param nombre el nombre del alumno que se quiere agregar a la lista.
     * @throws IllegalStateException si el nombre no se puede agregr a la lista.
     */
    public void agregarAlumnos(String nombre){
        if (!listaAlumnos.add(nombre)) {
            throw new IllegalStateException("El alumno no se ha podido agregar a la lista");
        } else {
            System.out.println("El alumno se ha agregado a la lista correctamente");
        }
    }

    /**
     * Método que elimina alumnos de la lista
     *
     * @author Gerard Luque
     * @param nombre el nombre que se quiere eliminar de la lista
     * @return true si se ha eliminado el alumno y false si no.
     */
    public boolean eliminarAlumnos(String nombre){
        boolean eliminar = false;
        if(listaAlumnos.contains(nombre)){
            listaAlumnos.remove(nombre);
            eliminar = true;
            return eliminar;
        }
        return eliminar;
    }

    /**
     * Método que comprueba la cantidad de alumnos que hay en la lista.
     *
     * @author Gerard Luque
     * @return el número de alumnos que hay en el listado.
     */
    public int cantidadAlumnos(){
        return listaAlumnos.size();
    }

    /**
     * Método que busca si en la lista está presente el nombre de un alumno específico.
     *
     * @author Gerard Luque
     * @param nombre el nombre que se quiere buscar en la lista.
     * @return Devuelve true si el nombre proporcionado está en la lista junto con un mensaje de
     * confirmación y false si no lo está junto con un menssaje de confirmación.
     */
    public boolean buscarAlumnos(String nombre){
        boolean contiene;
        if(listaAlumnos.contains(nombre)){
            contiene = true;
            System.out.println("El nombre proporcionado se encuentras en la lista");
        }else{
            contiene = false;
            System.out.println("El nombre proporcionado no se encuentras en la lista");
        }
        return contiene;
    }

    /**
     * Método setter para establecer la lista de alumnos.
     *
     * @author Gerard Luque
     * @return el listado de alumnos.
     */
    public List<String> getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * Método getter para la obtención de la lista de alumnos.
     *
     * @author Gerard Luque
     */
    public void setListaAlumnos(List<String> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * Método que devuelve una representación en cadena del objeto GestorAlumnos.
     *
     * @author Gerard Luque
     */
    @Override
    public String toString() {
        return "GestorAlumnos{" +
                "listaAlumnos=" + listaAlumnos +
                '}';
    }
}
