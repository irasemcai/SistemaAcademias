package pcs.is.domain;

/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */

/**
 *
 * @author Usuario
 */
public class TemaExamen {
    private ExperienciaEducativa experienciaEducativa;
    private String temasParcial;
    
    public TemaExamen(TemaExamen temaExamen){
        this.experienciaEducativa = temaExamen.experienciaEducativa;
        this.temasParcial= temaExamen.temasParcial;
    }
    
    public ExperienciaEducativa getEE(){
        return experienciaEducativa;
    }
    public void setEE(ExperienciaEducativa ee){
        this.experienciaEducativa= ee;
    }
    
    public String getTemasParcial(){
        return temasParcial;
    }
    public void setTemasParcial(String temasParcial){
        this.temasParcial = temasParcial;
    }
}

