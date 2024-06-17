

package elp.practica1;


public class Practica1 {

    public static void main(String[] args) {
        GestorLibros libros = new GestorLibros();
        GestorPrestamos prestamos = new GestorPrestamos();
        
        Autor autor1 = new Autor("pablo", "A-01");
        Autor autor2 = new Autor("pedro", "A-02");
        
        Libro libro1 = new Libro("L-01","Matilda" );
        Libro libro2 = new Libro("L-02", "Popeye" );
        
        
        
        libro1.anadir_autor(autor1);
        libro1.anadir_autor(autor2);
        
        prestamos.registrar_prestamo("L-01", "U-01");
        prestamos.mostrar_prestamos();
        prestamos.registrar_prestamo("L-01", "U-01");
        
        System.out.println("este es un ejemplo de git push");
    }
    
    

        
        
}
