package domain;

public class Usuario {
    private int id;
    private String username;
    private String password;
    private int tiempoEnApp;

    /*   ROLES:
    * 1: Usuario Común
    * 2: Artista
    * 3: Administrador       */

    private int rol;

    public Usuario(int id, String username, String password, int tiempoEnApp, int rol) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.tiempoEnApp = tiempoEnApp;
        this.rol = rol;
    }
}
