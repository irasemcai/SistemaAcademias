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
public class Acuerdo {
    private String acuerdo;
    private Date fecha;
    private String quien;
    
    public Acuerdo(Acuerdo acuerdo){
        this.acuerdo= acuerdo.acuerdo;
    }
    
    public String getAcuerdo(){
        return acuerdo;
    }
    public void setAcuerdo(String acuerdo){
        this.acuerdo= acuerdo;
    }
    
    public Date getFecha(){
        return fecha;
    }
    public void setFecha(Date fecha){
        this.fecha= fecha;
    }
    
    public String getQuien(){
        return quien;
    }
    public void setQuien(String quien){
        this.quien= quien;
    }
    
    public String consultarAcuerdoDe(String quienn){
        
        while(quien.equalsIgnoreCase(quienn)){
            
        }
        return null;
    }
    
    public int consultarAcuerdoPorFecha(Date fecha){
        
        return 0;
    }
    
}
