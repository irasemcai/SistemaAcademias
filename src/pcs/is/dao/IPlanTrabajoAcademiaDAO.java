/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.dao;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import pcs.is.domain.ActividadReunionAccion;
import pcs.is.domain.PlanTrabajoAcademia;

/**
 *
 * @author IrasemaCaicero
 */
public interface IPlanTrabajoAcademiaDAO {
   
   List<PlanTrabajoAcademia> obtenerTodosPlanTAcademia();
   List<PlanTrabajoAcademia> obtenerPlanTAcademiaPorEstado(String estado);
   PlanTrabajoAcademia buscarPlanTAcademia(String planTrabajoAcademia);
   PlanTrabajoAcademia buscarPlanTAcademiaporProgramaEduc (String programaEducativo);
   
   boolean crearPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia);   
   boolean editarPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia);
   boolean verPlanTrabajoAcademia (PlanTrabajoAcademia planTrabajoAcademia);
   boolean enviarPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia);
   boolean eliminarPlanTAcademia (PlanTrabajoAcademia planTrabajoAcademia);
   
   boolean cambiarEstadoAPlanTAcademia(String estado); //?
   
   //estos no se que pedo
   ArrayList<ActividadReunionAccion> buscaActividadPorFecha(Date fecha); 
   String buscarTemasdeEE(String ExperienciaEducativa);
}
