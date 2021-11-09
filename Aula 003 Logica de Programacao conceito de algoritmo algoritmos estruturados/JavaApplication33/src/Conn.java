
//import java.util.*;
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author azlin
 */
public class Conn {
    public static void main(String[] args) throws SQLException{
    /*private static final String Driver = "com.mysql.cj.jdbc.Driver";
    private static final String Url = "jdbc:mysql://localhost:3306/senac1";
    private static final String User = "root";
    private static final String Pass = "";*/
    
    /*public static Connection getConeConnection(){
        try {
            Class.forName(Driver);
            
            return DriverManager.getConnection(Url, User, Pass);
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexao", ex);
        } 
    }*/
    
    Connection myConn = null;
    Statement myStmt = null;
    ResultSet myRs = null;
    
    String User = "root";
    String pass = "";
    
    try{
        myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", User, pass);
        myStmt = myConn.createStatement();
        myRs = myStmt.executeQuery("select * from demo.employees");
        while (myRs.next()){
            System.out.println(myRs.getString("first_name") + ", " + myRs.getString("email"));
        }
    }catch (Exception e){
    
        e.printStackTrace();
    }finally{
        if(myRs != null){
            myRs.close();
        }
        if(myStmt != null){
            myStmt.close();
        }
        if(myConn != null){
            myConn.close();
        }
    }

}
}
