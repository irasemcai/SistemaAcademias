/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Irasema Caicero
 */
public class PlanTrabajoAcademia {
   private String estado;
   private Date fechaAprobacion;
   private String objetivoGeneral;
   private String planTrabajoAcademia;
   private String programaEducativo;
   private ArrayList <TemaExamen> temasExamen;
   private ArrayList <FormasEvaluacion> formasEvaluacion;
   private ArrayList <ActividadReunionAccion> actividadReunionAcciones;
   
/*   public PlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia){
       this.estado= planTrabajoAcademia.estado;
       this.fechaAprobacion = planTrabajoAcademia.fechaAprobacion;
       this.objetivoGeneral = planTrabajoAcademia.objetivoGeneral;
       this.planTrabajoAcademia = planTrabajoAcademia.planTrabajoAcademia;
       this.programaEducativo = planTrabajoAcademia.programaEducativo;
       this.temasExamen = planTrabajoAcademia.temasExamen;
       this.formasEvaluacion= planTrabajoAcademia.formasEvaluacion;
       this.actividadReunionAcciones = planTrabajoAcademia.actividadReunionAcciones;
   }
*/
    public PlanTrabajoAcademia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   public String getEstado(){
       return estado;
   }
   public void setEstado(String estado){
       this.estado= estado;
   }
   
   public Date getFechaAprobacion(){
       return fechaAprobacion;
   }
   public void setFechaAprobacion(Date fechaAprobacion){
       this.fechaAprobacion= fechaAprobacion;
   }
   
   public String getObjetivoGral(){
       return objetivoGeneral;
   }
   public void setObjetivoGral(String objetivoGral){
       this.objetivoGeneral= objetivoGral;
   }
   
   public String getPlanTrabajoAcademia(){
       return planTrabajoAcademia;
   }
   public void setPlanTrabajoAcademia(String planTrabajoAcademia){
       this.planTrabajoAcademia= planTrabajoAcademia;
   }
   
   public String getProgramaEducativo(){
       return programaEducativo;
   }
   public void setProgramaEducativo(String programaEduc){
       this.programaEducativo= programaEduc;
   }
   
   public ArrayList<TemaExamen> getTemasExamen(){
       return temasExamen;
   }
   public void setTemasExamen(ArrayList<TemaExamen> temasExamenes){
       this.temasExamen = temasExamenes;
   }
   
   public ArrayList<FormasEvaluacion> getFormasEvaluacion(){
       return formasEvaluacion;
   }
   public void setFormasEvaluacion(ArrayList<FormasEvaluacion> formasEvaluacion){
       this.formasEvaluacion= formasEvaluacion;
   }
   
   public ArrayList<ActividadReunionAccion> getActReunionAcciones(){
       return actividadReunionAcciones;
   }
   public void setActReunionAcciones (ArrayList<ActividadReunionAccion> ActReunionAcciones){
       this.actividadReunionAcciones= ActReunionAcciones;
   }
   
   public String toString(){
       return this.planTrabajoAcademia+ " " + this.fechaAprobacion+ " "+ this.programaEducativo+ " "+ this.actividadReunionAcciones;
   }

   public String buscarActividadPorFecha(Date fecha){
       DateFormat df = new SimpleDateFormat("000000");
       fecha= df.parse(String.valueOf(0));
       actividadReunionAcciones.get(fecha);
       return null;    
   }
   
}
