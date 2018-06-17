/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.dao;

import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import pcs.is.domain.ActividadReunionAccion;
import pcs.is.domain.PlanTrabajoAcademia;

/**
 *
 * @author Usuario
 */
public class PlanTrabajoAcademiaDAO implements IPlanTrabajoAcademiaDAO {
    private ArrayList<PlanTrabajoAcademia> listaPlanTrabajoAcademia;
    private String query;
    private Connection conexion;
    
    public PlanTrabajoAcademiaDAO(){
        
    }

    @Override
    public List<PlanTrabajoAcademia> obtenerTodosPlanTAcademia() {
        listaPlanTrabajoAcademia= new ArrayList<>();
        query = "Select * from PlanTrabajoAcademia";
    }

    @Override
    public List<PlanTrabajoAcademia> obtenerPlanTAPorEstado(String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanTrabajoAcademia buscarPlanTAcademia(String planTrabajoAcademia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanTrabajoAcademia buscarPlanTAcademiaporProgramaEduc(String programaEducativo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPlanTAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean agregarInfoPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean cambiarEstadoAPlanTAcademia(String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ActividadReunionAccion> buscaActividadPorFecha(Date fecha) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String buscarTemasdeEE(String ExperienciaEducativa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
