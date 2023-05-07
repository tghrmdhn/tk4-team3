/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TK4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



/**
 *
 * @author teguhramadhan
 */
public class jdbcConnection {
    public static Connection pool = null;
    
    public static String setConnectionMySQL(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           try {
                String dbname = "mahasiswa";
                String user = "root"; 
                String pass = "root";
                String urlDB = "jdbc:mysql://localhost:8889/"+dbname;
                pool = DriverManager.getConnection(urlDB, user, pass);  
                return "Sucess connect to DB 'Mahasiswa'";
             }
            catch(SQLException e){
               return "ERROR : " + e.getMessage();
            }
         }
         catch(ClassNotFoundException e) {
            return "ERROR : Class not found "+ e;
         }
    }
}
