

package elp.practica1;


public class Practica1 {

    public static void main(String[] args) {
        GestorLibros libros = new GestorLibros();
        Autor autor1 = new Autor("pablo", "A-01");
        Autor autor2 = new Autor("pedro", "A-02");
        Libro libro1 = new Libro("L-01","Matilda" );
        Libro libro2 = new Libro("L-02", "Popeye" );
        
        libro1.anadir_autor(autor1);
        libro1.anadir_autor(autor2);
        
        

        
        libros.anadir_libro(libro1);
        libros.anadir_libro(libro2);
        
        System.out.println(libros.getLibros());
        libros.buscar_libro("L-02");
    }
    
    

        
        
}
