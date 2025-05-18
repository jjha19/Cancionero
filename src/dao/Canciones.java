package dao;

import Common.Constantes;
import domain.Cancion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Canciones {
    ArrayList<Cancion> canciones;
    public Canciones(){
        ArrayList<Cancion> canciones = GestorCanciones.leerCancionesDeArchivo("bbdd_canciones.txt");
    }
    public Canciones(ArrayList<Cancion> canciones){
        this.canciones = canciones;
    }


    // Getters y Setters
    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public String toString(){
        return canciones.toString();
    }

    public Cancion encontrarCancion(String nombreCancion){
        boolean encontrado = false;
        for ( int i = 0; i < canciones.size(); i++) {
            if (canciones.get(i).getNombre().equals(nombreCancion)) {
                return canciones.get(i);
            }
        }
        System.out.println(Constantes.MALABUSQUEDA);
        return null;
    }
}
