package elp.practica1;

import java.util.HashSet;
import javax.swing.JOptionPane;

public class GestorPrestamos {

    HashSet<Prestamo> prestamos;

    public GestorPrestamos() {
        prestamos = new HashSet();
    }
    
    

    public void registrar_prestamo(String id_libro, String id_usuario) {
        Prestamo prestamo1 = new Prestamo(id_libro, id_usuario);
        if (!prestamo_encontrado(id_libro, id_usuario)){
            prestamos.add(prestamo1);
        }
        else{
            JOptionPane.showMessageDialog(null, "El prestamo ya existe");
        }
    }
    
    public boolean prestamo_encontrado(String id_libro, String id_usuario){
        boolean existe = false;
        for (Prestamo prestamo1 : prestamos) {
            if (prestamo1.getIdLibro().equals(id_libro) && 
                    prestamo1.getIdUsuario().equals(id_usuario) ){
                existe = true;
            }
        }
        return existe;
    }
    
    public void mostrar_prestamos(){
        for (Prestamo prestamo : prestamos) {
            System.out.println(prestamo);
        }
    }
    
    

}
