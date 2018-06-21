/*
 * Here comes the text of your license
 * Each line should be prefixed with  * 
 */
package pcs.is.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pcs.is.datasource.DataBase;
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
        conexion= DataBase.getDataBaseConnection();
        try{
            PreparedStatement statement= conexion.prepareStatement(query);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                PlanTrabajoAcademia planTrabajoAcademia= new PlanTrabajoAcademia();
                planTrabajoAcademia.setPlanTrabajoAcademia(result.getString("PlanTrabajoAcademia"));
                planTrabajoAcademia.setFechaAprobacion(result.getDate("fechaAprobacion"));
                planTrabajoAcademia.setEstado(result.getString("Estado"));
                listaPlanTrabajoAcademia.add(planTrabajoAcademia);
            }
        }catch(SQLException ex){
             Logger.getLogger(PlanTrabajoAcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);           
        }finally{
            DataBase.closeConnection();
        }           
    return null;   
    }

    @Override
    public List<PlanTrabajoAcademia> obtenerPlanTAcademiaPorEstado(String estado){
        listaPlanTrabajoAcademia= new ArrayList<>();
        query= "select * from PlanTrabajoAcademia pta where pta.estadoPlanTrabajoAcademia = ?";
        conexion = DataBase.getDataBaseConnection();
        try{
            PreparedStatement statement= conexion.prepareStatement(query);
            statement.setString(1, "%"+estado+ "%");
            ResultSet result= statement.executeQuery();
            while(result.next()){
                PlanTrabajoAcademia planTrabajoAcademia = new PlanTrabajoAcademia();
                planTrabajoAcademia.setPlanTrabajoAcademia(result.getString("PlanTrabajoAcademia"));
                planTrabajoAcademia.setProgramaEducativo(result.getString("programaEducativo"));
                planTrabajoAcademia.setEstado(result.getString("estado"));
                listaPlanTrabajoAcademia.add(planTrabajoAcademia);
            } 
        }catch(SQLException ex){
                Logger.getLogger(PlanTrabajoAcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                    DataBase.closeConnection();
            }       
        return listaPlanTrabajoAcademia;
    }

    @Override
    public PlanTrabajoAcademia buscarPlanTAcademia(String planTrabajoAcademia) {
       listaPlanTrabajoAcademia= new ArrayList<>();
       query = "select * from PlanTrabajoAcademia pta where pta.idplanTrabajoAcademia= ?";
       conexion= DataBase.getDataBaseConnection();
       
       try{
           PreparedStatement statement=conexion.prepareStatement(query);
           statement.setString(1, "%"+planTrabajoAcademia+"%");
           ResultSet result = statement.executeQuery();
           while(result.next()){
               PlanTrabajoAcademia pta = new PlanTrabajoAcademia();
               pta.setPlanTrabajoAcademia(result.getString("nombre"));
               pta.setProgramaEducativo(result.getString("programaEducativo"));
               listaPlanTrabajoAcademia.add(pta);
           }
       }catch(SQLException ex){
           Logger.getLogger(PlanTrabajoAcademiaDAO.class.getName()).log(Level.SEVERE, null, ex);
       }finally{
           DataBase.closeConnection();
       }
       return null;
    }

    @Override
    public PlanTrabajoAcademia buscarPlanTAcademiaporProgramaEduc(String programaEducativo) {
    listaPlanTrabajoAcademia = new ArrayList<>();
    query= "select * from PlanTrabajoAcademia pta where pta.";
    conexion= DataBase.getDataBaseConnection();
    try{
        PreparedStatement statement= conexion.prepareStatement(query);
        statement.setString(1, "%"+programaEducativo+"%");
        ResultSet result= statement.executeQuery();
        while(result.next()){
            PlanTrabajoAcademia pta = new PlanTrabajoAcademia();
            pta.setPlanTrabajoAcademia(result.getString("nombre"));
            pta.setEstado(result.getString("estado"));
            listaPlanTrabajoAcademia.add(pta);
        }
    }catch(SQLException ex){
        Logger.getLogger(PlanTrabajoAcademia.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
        DataBase.closeConnection();
    }       
    return null;
    }

    @Override
    public boolean crearPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
       query= "insert into PlanTrabajoAcademia(planTrabajoAcademia, programaEducativo, objetivoGeneral, temasExamen, formasEvaluacion"+
               "actividadReunionesAcciones) values (?,?,?,?,?,?)";
       conexion= DataBase.getDataBaseConnection();
       try{
           PreparedStatement statement=conexion.prepareStatement(query);
           statement.setString(1, planTrabajoAcademia.getPlanTrabajoAcademia());
           statement.setString(2, planTrabajoAcademia.getProgramaEducativo());
           statement.setString(3, planTrabajoAcademia.getObjetivoGral());
           statement.setArray(4, planTrabajoAcademia.getTemasExamen());
           statement.setArray(5, planTrabajoAcademia.getFormasEvaluacion());
           statement.setArray(6, planTrabajoAcademia.getActReunionAcciones());
       }catch(SQLException ex){
           Logger.getLogger(PlanTrabajoAcademiaDAO.class.getName()).log(Level.SEVERE,null,ex);
       }finally{
           DataBase.closeConnection();
       }
       return false;
    }
    @Override
    public boolean editarPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
    query="insert into PlanTrabajoAcademia ( values(?,?,?,?,?,?,?))";
    conexion= DataBase.getDataBaseConnection();
    try{
        PreparedStatement statement= conexion.prepareStatement(query);
        statement.setDate(1, planTrabajoAcademia.getFechaAprobacion());
        statement.setArray(1, planTrabajoAcademia.getTemasExamen());
        statement.setString(1, planTrabajoAcademia.getObjetivoGral());
        statement.setString(1, planTrabajoAcademia.getActReunionAcciones());
        statement.setString(1, planTrabajoAcademia.getFormasEvaluacion());               
    }catch(SQLException ex){
        Logger.getLogger(PlanTrabajoAcademia.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
        DataBase.closeConnection();
    }       
    return false;
    }

    @Override
    public boolean verPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean enviarPlanTrabajoAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
    
    @Override
    public boolean eliminarPlanTAcademia(PlanTrabajoAcademia planTrabajoAcademia) {
    query= "delete from PlanTrabajo where idPlanTrabajoAcademia=?";
    conexion=DataBase.getDataBaseConnection();
    try{
        PreparedStatement statement = conexion.prepareStatement(query);
        statement.execute();
    }catch(SQLException ex){
        Logger.getLogger(PlanTrabajoAcademia.class.getName()).log(Level.SEVERE, null, ex);
    }finally{
        DataBase.closeConnection();
    }
        
        return false;
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
