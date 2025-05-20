package ui;

import Common.Constantes;
import dao.Canciones;
import dao.GestorCanciones;
import dao.ReproductorMP3;
import domain.Cancion;

import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String archivo = "src/dao/bbdd_canciones.txt";
        Canciones canciones = new Canciones(GestorCanciones.leerCancionesDeArchivo(archivo));
        ReproductorMP3 reproductor = new ReproductorMP3();

        System.out.println(Constantes.BIENVENIDA);
        boolean valido = false;
        System.out.println(canciones);
        do {
            System.out.println("¿Que cancion quieres poner?");
            String request = EntradaSalida.lectorDeTexto();

            reproductor.reproducirCancion(canciones.encontrarCancion(request));
        }while (!valido);





    }
}