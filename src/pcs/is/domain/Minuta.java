/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Minuta {
    private ArrayList<Docente> asistentes;
    private String fechaHoraReunion;
    private String nombreOranizador;
    private String proyecto;
    
    public boolean buscarAsistencia(Docente nombre){
        if(asistentes.contains(nombre)){
            return true;
        }       
        return false;
    }    
}
