package elp.practica1;

import javax.swing.JOptionPane;

public class Menu {

    public void menu() {

        
        GestorPrestamos gpresta = new GestorPrestamos();
        GestorLibros glibros = new GestorLibros();

        while (true) {
            
            int paciente = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu\n\n 1. Agregar un libro\n 2. Eliminar un libro\n 3. Buscar un libro\n 4. Agregar un autor\n"
                                                                                                  + " 5. Eliminar un autor\n 6. Buscar un autor\n 7. Registrar un préstamo\n 8. Salir del programa"));
            
            switch (paciente) {
                case 1:
                    String libroInput = JOptionPane.showInputDialog(null, "Agregar un libro");
                    Libro agregarLibro = new Libro(libroInput, libroInput);
                    glibros.anadir_libro(agregarLibro);
                    break;
                case 2:
                    String eliminar_libro = JOptionPane.showInputDialog(null, "Eliminar un libro"); 
                    glibros.eliminar_libro(eliminar_libro);
                    break;
                case 3:
                    String buscarlibro = JOptionPane.showInputDialog(null, "Buscar un libro");
                    glibros.buscar_libro(buscarlibro);
                    break;
                    
                    // Falta agregar metodo para Autor
                    
                case 4:
                    String agregarautor = JOptionPane.showInputDialog(null, "Agregar un autor");
                    
                    break;
                case 5:
                    String eliminarautor = JOptionPane.showInputDialog(null, "Eliminar un autor");
                    
                    break;
                case 6:
                    String buscarautor = JOptionPane.showInputDialog(null, "Buscar un autor");
                    
                    break;
                case 7:
                    String prestamoUsuario = JOptionPane.showInputDialog(null, "Nombre Usuario");
                    String prestamoLibro = JOptionPane.showInputDialog(null, "Libro a prestar");
                    
                    gpresta.registrar_prestamo(prestamoLibro, prestamoUsuario);
                    gpresta.mostrar_prestamos();
                    
                    
                    break;
                case 8:
                    System.exit(0);
                    break;
            }
        }

    }
}
