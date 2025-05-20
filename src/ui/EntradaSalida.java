package ui;

import Common.Constantes;

import java.util.Scanner;

public class EntradaSalida {


    public static int lectorDeOpcionesNumericas(){
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        int opcion = 0;
        do {
            try {
                opcion = lector.nextInt();
                lector.nextLine();
                valido = true;
            } catch (Exception e) {
                System.out.println(Constantes.FORMATOERRONEO);
                lector.nextLine();
            }
        }while (!valido);
        return opcion;
    }

    public static String lectorDeTexto(){
        Scanner lector = new Scanner(System.in);
        boolean valido = false;
        String texto = lector.nextLine();
        if (texto.isEmpty()){
            System.out.println(Constantes.FORMATOERRONEO);
        } else return texto;
        return texto;
    }

    /*
    public static int eleccionRol (){
        int rol = 0;
        do {
            System.out.println(Constantes.OPCIONESROL + Constantes.MENU);
            int opcion = EntradaSalida.lectorDeOpcionesNumericas();
            switch (opcion) {
                case 1:
                    rol = 1;
                break;
                case 2:
                    if (Comprobaciones.comprobarContraseña()){
                        rol = 2;
                    }
                    break;
            }
            return rol;
        }while (rol != 0);
    }

    */
}
