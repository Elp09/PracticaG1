package elp.practica1;

import java.util.ArrayList;


public class GestorLibros {
    
    ArrayList<Libro> libros;

    public GestorLibros() {
        libros = new ArrayList();
    }
    
    
    public void anadir_libro(Libro libro){
        libros.add(libro);
    }
    
    public void eliminar_libro(String id){
        for (Libro libro : libros) {
            if (libro.getId().equals(id)){
                libros.remove(libro);
            }
        }
    }
    
    
}
