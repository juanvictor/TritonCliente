/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;

/**
 *
 * @author Desarrollo01
 */

public class Conexion {

    public Conexion(){
    }

    public Connection getConexion(){
        Connection con     = null;
        String urlDataBase = "jdbc:postgresql://192.168.30.20:5432/db_triton_20180221_1";
        String user        = "jserrudo";
        String password    = "lgsucresol";

        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(urlDataBase, user, password);
        }
        catch(Exception e){
        }

        return con;
    }
}
