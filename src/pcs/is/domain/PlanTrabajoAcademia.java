/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.domain;

import java.sql.Date;
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
   
   public PlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia){
       this.estado= planTrabajoAcademia.estado;
       this.fechaAprobacion = planTrabajoAcademia.fechaAprobacion;
       this.objetivoGeneral = planTrabajoAcademia.objetivoGeneral;
       this.planTrabajoAcademia = planTrabajoAcademia.planTrabajoAcademia;
       this.programaEducativo = planTrabajoAcademia.programaEducativo;
       this.temasExamen = planTrabajoAcademia.temasExamen;
       this.formasEvaluacion= planTrabajoAcademia.formasEvaluacion;
       this.actividadReunionAcciones = planTrabajoAcademia.actividadReunionAcciones;
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
   
   
   
   public String buscarActividadporFecha(Date fecha){
       return null;
   }
   
}
