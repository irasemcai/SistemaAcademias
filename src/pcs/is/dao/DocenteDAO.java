package pcs.is.dao;

import java.sql.Connection;

public class DocenteDAO implements IDocenteDAO{
    private String query;
    private Connection connection;

    @Override
    public void asignarCurso() {
        query= "insert into curso ";
    }

    @Override
    public boolean guardarPlanCurso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean guardarAvancrProgramatico() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
