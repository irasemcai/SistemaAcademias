/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

import java.sql.Date;

/**
 *
 * @author Usuario
 */
public class ActividadReunionAccion {
    private String actividad;
    private Date fecha;
    private String formaOperar;
    private int meta;
    private String objetivo;
    
    public ActividadReunionAccion (ActividadReunionAccion actividadReunionAccion){
        this.actividad = actividadReunionAccion.actividad;
        this.fecha = actividadReunionAccion.fecha;
        this.formaOperar= actividadReunionAccion.formaOperar;
        this.meta = actividadReunionAccion.meta;
        this.objetivo = actividadReunionAccion.objetivo;
    }
    
    public String getActividad (){
        return actividad;
    }
    public void setActividad (String actividad){
        this.actividad= actividad;
    }
    
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha= fecha;
    }
    
    public String getFormaOperar(){
        return formaOperar;
    }
    public void setFormaOperar(String formaO){
        this.formaOperar= formaO;
    }
    
    public int getMeta(){
        return meta;
    }
    public void setMeta(int meta){
        this.meta= meta;
    }
    
    public String getObjetivo(){
        return objetivo;
    }
    public void setObjetivo(String objetivo){
        this.objetivo= objetivo;
    }
      
    public String toString(){
        return this.fecha + " "+ actividad+ " "+ formaOperar;
    }
}