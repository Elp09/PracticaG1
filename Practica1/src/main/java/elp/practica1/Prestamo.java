
package elp.practica1;

import java.util.Date;

public class Prestamo {

    String idLibro;
    String idUsuario;
    Date fechaPrestamo;

    public Prestamo(String idLibro, String idUsuario) {
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        fechaPrestamo = new Date();
    }
    
        

    public String getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(String idLibro) {
        this.idLibro = idLibro;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idLibro=" + idLibro + ", idUsuario=" + idUsuario + ", fechaPrestamo=" + fechaPrestamo + '}';
    }
    
    
    
}

