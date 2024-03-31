package co.edu.ucentral.taller.tallerIngSoftware.Utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class utilidad {
    public static String convertirFechaAString(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }
}
