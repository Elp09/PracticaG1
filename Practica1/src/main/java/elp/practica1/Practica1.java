

package elp.practica1;


public class Practica1 {

    public static void main(String[] args) {
        Autor autor1 = new Autor("pablo", "A-01");
        Autor autor2 = new Autor("pedro", "A-02");
        Libro libro1 = new Libro("Matilda", "L-01");
        libro1.anadir_autor(autor1);
        libro1.anadir_autor(autor2);
        System.out.println(libro1);
        System.out.println(libro1.getAutores());
    }
    
    

        
        
}
