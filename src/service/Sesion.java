package service;

import Common.Constantes;
import domain.Usuario;
import ui.EntradaSalida;

public class Sesion {
    public static Usuario gestionarUsuario(int rol) {
        Usuario user = null;
        if (rol == 1) {
            System.out.println(Constantes.PIDEUSERNAME);
            EntradaSalida.lectorDeTexto();
        } else if (rol==2) {

        }
        return user;
    }
}
