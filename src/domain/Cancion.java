package domain;

public class Cancion {

    private String path;
    private String id;
    private String nombre;
    private String genero;
    private String autor;
    private int duracion;
    private String disco;
    private String letra;

    public Cancion(String path, String id, String nombre, String genero, String autor, int duracion, String disco, String letra) {
        this.path = path;
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.autor = autor;
        this.duracion = duracion;
        this.disco = disco;
        this.letra = letra;
    }


    //Getters y setters
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }
}
