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
        ReproductorMP3 reproductor = new ReproductorMP3();
        Canciones canciones = new Canciones(GestorCanciones.leerCancionesDeArchivo(archivo));


        System.out.println(Constantes.BIENVENIDA);
        System.out.println(Constantes.INICIARSESION);
        int opcion = EntradaSalida.lectorDeOpcionesNumericas();
        Usuario user = Sesion.gestionarUsuario(opcion);
        System.out.println(canciones.listarCanciones());
        System.out.println(Constantes.PREGUNTARPORCANCION);
        String request = EntradaSalida.lectorDeTexto();
        reproductor.reproducirCancion(canciones.encontrarCancion(request));






    }
}