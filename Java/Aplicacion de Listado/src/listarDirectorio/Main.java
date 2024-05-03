package listarDirectorio;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String ruta = pedirRuta();
        File directorio = new File(ruta);
        listar(directorio);

    }

    static String pedirRuta(){
        Scanner scn = new Scanner(System.in);
        String ruta;
        System.out.println("Introduzca la ruta del directorio que quiere listar");
        ruta = scn.next();
        return ruta;
    }

    static void listar(File directorio){

        File[] archivo = directorio.listFiles();
        System.out.println(directorio.getAbsolutePath());
        for (File elemento : archivo){
            System.out.println("\t"+elemento.getAbsolutePath());
            if(elemento.isDirectory()){
                listar(elemento);
            }
        }

    }
}
