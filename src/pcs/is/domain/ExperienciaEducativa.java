/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

/**
 *
 * @author Irasema Caicero
 */
public class ExperienciaEducativa {
    private String area;
    private Curso curso;
    private String nombreEE;
    private int numCreditos;
    
    public ExperienciaEducativa(ExperienciaEducativa ee){
        this.area= ee.area;
        this.curso= ee.curso;
        this.nombreEE= ee.nombreEE;
        this.numCreditos= ee.numCreditos;
    }
    
    public String getArea(){
        return area;
    }
    public void setArea(String area){
        this.area= area;
    }
    
    public Curso getCurso(){
        return curso;
    }
    public void setCurso(Curso curso){
        this.curso= curso;
    }
    
    public String getNombreEE(){
        return nombreEE;
    }
    public void setNombreEE(String nombreEE){
        this.nombreEE= nombreEE;
    }
    
    public int getNumCreditos(){
        return numCreditos;
    }
    public void setNumCreditos(int numCreditos){
        this.numCreditos= numCreditos;
    }
}
