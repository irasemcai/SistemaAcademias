/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.uv.fei.logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.uv.fei.dataaccess.DataBase;
import mx.uv.fei.domain.UserAccount;

/**
 *
 * @author rvo
 */
public class AuthenticationService {   
    
    public enum AuthenticationResult{
        USER_AUTHENTICATED,USER_NOT_FOUND
    }
    
    public AuthenticationResult authenticateUser(UserAccount user){
        AuthenticationResult userAuthenticated=AuthenticationResult.USER_NOT_FOUND;        
        String query="select count(*) as usuarios from cuentaacceso where idusuario='"+user.getUsername()+"' and password='"+user.getPassword()+"'";
        
        DataBase database=DataBase.getDataBaseConnection();         
        
        try {           
            ResultSet result=database.executeQuery(query);               
            if(result.next()){
                    if(Integer.parseInt(result.getString("usuarios"))>0){
                        userAuthenticated=AuthenticationResult.USER_AUTHENTICATED;
                    }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthenticationService.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            DataBase.closeConnection();
        }
        return userAuthenticated;
    }
}

