/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

/**
 *
 * @author Irasema Caicero
 */
public class ReunionAcademia {
    private Academia academia;
    private String asunto;
    private Date fecha;
    private Time hora;
    private String lugar;
    private ArrayList<PreRequisito> preRequisitos;
    private ArrayList<Asunto> Listaasunto;
    
   public ReunionAcademia(ReunionAcademia evento){
       
   }
   
   
}
