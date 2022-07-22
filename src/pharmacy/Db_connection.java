/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacy;

import java.sql.*;
public class Db_connection {
    Connection cnx;
    String urldata;
    String urldriver;
    public Db_connection(){
        urldriver="com.mysql.jdbc.Driver";
        urldata="jdbc:mysql://localhost:3306/pharmacy";
        //pilote 
        try{
            Class.forName(urldriver);
            System.out.println("Driver ok ...");
        }catch(ClassNotFoundException exception){
            System.out.println("Driver not found");
        }
        // database
        try{
            cnx=DriverManager.getConnection(urldata,"root","");
            System.out.println("Connected");
        }catch(SQLException exception){
            System.out.println("Data base not found");
        }
    }
    Connection getconn(){
    return cnx; 
    }
}
