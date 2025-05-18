package domain;

import java.util.ArrayList;

public class Usuario {
    private int id;
    private String username;
    private String password;
    private int tiempoEnApp;
    private ArrayList<Playlist> playlists;

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

    //Getters Y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getTiempoEnApp() {
        return tiempoEnApp;
    }

    public void setTiempoEnApp(int tiempoEnApp) {
        this.tiempoEnApp = tiempoEnApp;
    }

    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }

    public int getRol() {
        return rol;
    }

    public void setRol(int rol) {
        this.rol = rol;
    }
}


class Artista extends Usuario{
    private ArrayList<Cancion> canciones;
    public Artista(int id, String username, String password, int tiempoEnApp, int rol, ArrayList<Cancion> canciones) {
        super(id, username, password, tiempoEnApp, rol);
        this.canciones = canciones;
    }
}
