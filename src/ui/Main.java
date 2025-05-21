package ui;

import Common.Constantes;
import dao.Usuarios;
import domain.Usuario;
import service.SesionImplementacion;


public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        Usuario usuarioEnSesion;

        System.out.println(Constantes.BIENVENIDA);
        do {
        System.out.println(Constantes.INICIARSESION);
        int opcion = EntradaSalida.lectorDeOpcionesNumericas();
        usuarioEnSesion = SesionImplementacion.gestionarUsuario(opcion, usuarios.getUsuarios());
        }while (usuarioEnSesion == null);

        EntradaSalida.mainMenu();
    }
}