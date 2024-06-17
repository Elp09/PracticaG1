
package elp.practica1;

import java.util.HashMap;
import java.util.Map;


public class GestionAutores {

    HashMap<String, String> authors;

    public GestionAutores() {
        this.authors = new HashMap<>();
    }

public void mostrarAutores() {
    boolean hayAutores = false;
    
    for (Map.Entry<String, String> entry : authors.entrySet()) {
        hayAutores = true;
        System.out.println("Autor ID: " + entry.getKey() + ", Nombre: " + entry.getValue());
    }
    
    if (!hayAutores) {
        System.out.println("No hay autores registrados aún.");
    }
}


    public void addAuthors(String name, String id) {
        authors.put(name, id);
        System.out.println("Se agrego al autor " + id +"\nID:" + name);
    }

    public void removeAuthor(String id) {
        boolean encontrado = false;
        for (Map.Entry<String, String> entry : authors.entrySet()) {
            if (entry.getKey().equals(id)) {
                authors.remove(id);
                System.out.println("Se eliminó el autor con el ID: " + id);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se eliminó ningún autor con ese ID porque no existe.");
        }
    }

    public void SearchAuthors(String id) {
        boolean encontrado = false;
        for (Map.Entry<String, String> entry : authors.entrySet()) {
            if (entry.getKey().equals(id)) {
            System.out.println("Se encontro el autor con el ID: " + id);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontro ninguin autor con ese nombre, Por favor registrarlo.");
        }
    }

    public HashMap<String, String> getAuthors() {
        return authors;
    }

    public void setAuthors(HashMap<String, String> authors) {
        this.authors = authors;
    }

}
