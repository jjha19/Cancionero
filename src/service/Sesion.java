package service;

import Common.Constantes;
import domain.Usuario;
import ui.EntradaSalida;

public class Sesion {
    public static Usuario gestionarUsuario(int opcion) {
        Usuario user = null;
        if (opcion == 1) {
            System.out.println(Constantes.PIDEROL);
            int rol = EntradaSalida.lectorDeOpcionesNumericas();
            System.out.println(Constantes.PIDEUSERNAME);
            String username = EntradaSalida.lectorDeTexto();
            System.out.println(Constantes.PIDECONTRASEÑA);
            String password = EntradaSalida.lectorDeTexto();

            user = new Usuario()
        } else if (opcion==2) {

        }
        return user;
    }
}
