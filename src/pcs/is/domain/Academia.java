/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

import java.util.ArrayList;

/**
 *
 * @author Irasema Caicero
 */
public class Academia {
    private String nombre;
    private String idAcademia;
    private ArrayList<Docente> miembrosAcademia;
    private CoordinadorAcademia coordinadorAcademia;
    
    public String getNombreAcademia(){
        return nombre;
    }
    public void setNombreAcademia(String nombreAcademia){
        this.nombre= nombreAcademia;
    }
}
