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
        boolean removed = false;
        for (Libro libro : libros) {
            if (libro.getId().equals(id)){
                removed = true;
                libros.remove(libro);
            }
        }
        if (!removed){
            System.out.println("No se elimino ningun libro");
        }
            
    }
    
    public void buscar_libro(String id){
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getId().equals(id)){
                encontrado = true;
                System.out.println("Se encontro el libro: " + libro);
            }
        }
        if (!encontrado){
            System.out.println("No se encontro ningun libro");
        }
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    
    
}
