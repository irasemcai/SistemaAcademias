/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

/**
 *
 * @author Usuario
 */
public class FormasEvaluacion {
    private String elemento;
    private int porcentaje;
    
    public FormasEvaluacion(FormasEvaluacion formaEvaluacion){
        this.elemento= formaEvaluacion.elemento;
        this.porcentaje= formaEvaluacion.porcentaje;
    }
    
    public String getElemento(){
        return elemento;
    }
    
     public void setElemento(String elementoEval){
        this.elemento= elementoEval;
    }
    
    public int getPorcentaje(){
        return porcentaje;
    }
    
    public void setPorcentaje (int porcentaje){
        this.porcentaje= porcentaje;
    }
    
    public int porcentajeAvance(){
        return 0;       
    }
}
