package co.edu.ucentral.taller.tallerIngSoftware.utilidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidad {
    public static String convertirFechaAString(Date fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(fecha);
    }
}
