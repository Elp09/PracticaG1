package elp.practica1;

import java.util.ArrayList;


public class Libro {
    private String id;
    private String titulo;
    private ArrayList<Autor> autores;

    @Override
    public String toString() {
        return "{" + "id=" + id + ", titulo=" + titulo + '}';
    }

    public Libro(String id, String titulo) {
        this.id = id;
        this.titulo = titulo;
        autores = new ArrayList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }
    
    public void anadir_autor(Autor autor){
        autores.add(autor);
    }
        
    
    
    
    
    
}
