package pcs.is.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pcs.is.datasource.DataBase;

public class CursoDAO implements ICursoDAO{
    private String query;
    private Connection connection;

    @Override
    public boolean guardarCurso(Curso nuevo) {
        query= "insert into curso (experiencia_educativa, bloque, seccion) values ( ?. ?, ?)";
        connection= DataBase.getDataBaseConnection();
                
        try{
            PreparedStatement statement= connection.prepareStatement(query);
            
            statement.setString(curso.getNombre());
            statement.setInt(curso.getBloque());
            statement.setInt(curso.getSeccion());
            statement.execute();
        }catch(SQLException ex){
            Logger.getLogger(CursoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DataBase.closeConnection();
        }
        
        return false;
    }

}
