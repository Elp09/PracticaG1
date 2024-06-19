
package elp.practica1;

import javax.swing.JOptionPane;

public class Menuu {
    
    int opc;
    public void menu() {


        GestorPrestamos gpresta = new GestorPrestamos();
        GestorLibros glibros = new GestorLibros();
        GestionAutores gautores = new GestionAutores();
        
        while (opc !=9) {
            String id_libro;

            opc = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                              -----Menu Biblioteca------
                                                                              
                                                                               1. Agregar un libro
                                                                               2. Eliminar un libro
                                                                               3. Buscar un libro
                                                                               4. Agregar un autor
                                                                               5. Eliminar un autor
                                                                               6. Buscar un autor
                                                                               7. Registrar un pr\u00e9stamo
                                                                               8. Mostrar autores
                                                                               9. Salir del programa"""));

            switch (opc) {
                case 1:
                    String libroInput = JOptionPane.showInputDialog(null, "Digite el libro que desea agregar:");
                    Libro agregarLibro = new Libro(libroInput, libroInput);
                    glibros.anadir_libro(agregarLibro);
                    break;
                case 2:
                    id_libro = JOptionPane.showInputDialog(null, "Digite el id del libro que desea eliminar:"); 
                    glibros.eliminar_libro(id_libro);
                    break;
                case 3:
                    id_libro = JOptionPane.showInputDialog(null, "Digite el libro que desea buscar:");
                    glibros.buscar_libro(id_libro);
                    break;

                case 4:
                    String name = JOptionPane.showInputDialog(null, "Digite el nombre del autor.");
                    String id = JOptionPane.showInputDialog(null, "Digite el id del autor.");
                    gautores.addAuthors(id, name);
                    break;
                case 5:
                    String eliminarautor = JOptionPane.showInputDialog(null, "Dgite el id del autor que desea eliminar:");
                    gautores.removeAuthor(eliminarautor);
                    break;
                case 6:
                    String buscarautor = JOptionPane.showInputDialog(null, "Buscar un autor por id");
                    gautores.SearchAuthors(buscarautor);

                    break;
                case 7:
                    String prestamoUsuario = JOptionPane.showInputDialog(null, "Nombre Usuario");
                    String prestamoLibro = JOptionPane.showInputDialog(null, "Libro a prestar");

                    gpresta.registrar_prestamo(prestamoLibro, prestamoUsuario);
                    gpresta.mostrar_prestamos();


                    break;
                    
                    
                case 8:
                    gautores.mostrarAutores();
                    break;
                    case 9:
                        System.exit(0);
                        break;
            }
        }

    }
}
    

