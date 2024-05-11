# Gestor de Alumnos

Esta es una aplicación simple en Java que gestiona una lista de nombres de alumnos.

## Estructura del Proyecto

El proyecto está organizado de la siguiente manera:
``````
src/
  │
  └── org/
        ├── GestorAlumnos.java         # Clase Java que representa el gestor de alumnos
        ├── GestorAlumnos_test.java    # Clase de prueba JUnit para el gestor de alumnos
        └── Main.java

``````

## Funcionalidades

La aplicación gestora de alumnos incluye las siguientes funcionalidades:

- **Agregar Alumnos:** Método para agregar alumnos a la lista.
- **Eliminar Alumnos:** Método para eliminar alumnos de la lista.
- **Ver Cantidad de Alumnos:** Método para ver el número de alumnos en la lista.
- **Buscar Alumnos:** Método para buscar un alumno específico en la lista.
- **Listar Alumnos:** Método para obtener la lista completa de alumnos.

## Uso

Para utilizar la aplicación, simplemente compila y ejecuta los archivos Java. Puedes interactuar con la clase GestorAlumnos para gestionar los alumnos y utilizar la clase GestorAlumnos_test para ejecutar pruebas unitarias.

## Ejemplo

Aquí tienes un ejemplo básico de cómo usar la clase GestorAlumnos:

``````
public static void main(String[] args) {
    GestorAlumnos gestor = new GestorAlumnos();

    // Adding students
    gestor.agregarAlumnos("Juan");
    gestor.agregarAlumnos("María");

    // Removing a student
    gestor.eliminarAlumnos("Juan");

    // Viewing student count
    System.out.println("Number of students: " + gestor.cantidadAlumnos());

    // Searching for a student
    boolean found = gestor.buscarAlumnos("María");
    if (found) {
        System.out.println("María found in the list.");
    } else {
        System.out.println("María not found in the list.");
    }
}
``````
## Pruebas

Las pruebas unitarias para la clase GestorAlumnos están incluidas en la clase GestorAlumnos_test utilizando el framework JUnit. Puedes ejecutar estas pruebas para garantizar la corrección de la aplicación.

## Dependencias

Este proyecto utiliza Maven para la gestión de dependencias. Las dependencias necesarias están incluidas en el archivo pom.xml.


# Student Manager

This is a simple Java application that manages a list of student names.

## Project Structure

The project is organized as follows:
``````
src/
  │
  └── org/
        ├── GestorAlumnos.java # Java class representing the student manager
        ├── GestorAlumnos_test.java # JUnit test class for the student manager
        └── Main.java

``````
## Features

The student manager application includes the following functionalities:

- **Adding Students:** Method to add students to the list.
- **Removing Students:** Method to remove students from the list.
- **Viewing Student Count:** Method to see the number of students in the list.
- **Searching for Students:** Method to search for a specific student in the list.
- **Listing Students:** Method to get the complete list of students.

## Usage

To use the application, simply compile and run the Java files. You can interact with the `GestorAlumnos` class to manage the students and use the `GestorAlumnos_test` class to run unit tests.

## Example

Here's a basic example of how to use the `GestorAlumnos` class:

```java
public static void main(String[] args) {
    GestorAlumnos gestor = new GestorAlumnos();

    // Adding students
    gestor.agregarAlumnos("Juan");
    gestor.agregarAlumnos("María");

    // Removing a student
    gestor.eliminarAlumnos("Juan");

    // Viewing student count
    System.out.println("Number of students: " + gestor.cantidadAlumnos());

    // Searching for a student
    boolean found = gestor.buscarAlumnos("María");
    if (found) {
        System.out.println("María found in the list.");
    } else {
        System.out.println("María not found in the list.");
    }
}

``````
## Testing
Unit tests for the GestorAlumnos class are included in the GestorAlumnos_test class using the JUnit framework. You can run these tests to ensure the correctness of the application.

## Dependencies
This project uses Maven for dependency management. The necessary dependencies are included in the pom.xml file.