/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalizacija;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.UIManager;

/**
 *
 * @author Ivan
 */
public class Bolnica {
    public static List<Lekar> doctorList=new ArrayList<>();
    public List<Sestra> nurseList=new ArrayList<>();
    public static List<Pacijent> patientList=new ArrayList<>();

  
    
   
     
    static Lekar d1=new Lekar("1231234", "12", "Gregory House", "", "24563");
    static Lekar d2=new Lekar("56956897", "7", "Gruja Petrovic", "", "467234");
    static Lekar d3=new Lekar("13454345", "15", "Srdjan Cvetkovic", "", "234532");
   
    
    
    
    public static Lekar vratiDoktoraNaOsnovuImena(String ime){
        
        Lekar d = null;
    switch(ime){
        case "Gregory House":
            d=d1;break; 
        case "Gruja Petrovic":
            d=d2;break;
        case "Srdjan Cvetkovic":
            d=d3;break;
           
        
       }
       
      return d;
    }
    
    public static  Connection konekcija(){
    
    
    
         Connection conn=null;
        try{
        String driverName="oracle.jdbc.driver.OracleDriver";
        Class.forName(driverName);
        String serverName="Dubravka-HP";
        String serverPort="1521";
        String sid="xe";
        String url="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
        String username="ivan";
        String password="ivan";
        
        conn=DriverManager.getConnection(url,username,password);
            System.out.println("Uspesno konektovan!"); 
                    return conn;

        }catch(ClassNotFoundException e){
            System.out.println("nije mogao pronaci driver"+e.getMessage());
                    return conn;

        }catch(SQLException e){
            System.out.println("nije se mogao konektovati"+e.getMessage());
        
                    return conn;

        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        Bolnica b=new Bolnica();
        
        
        doctorList.add(d1);
        doctorList.add(d2);
        doctorList.add(d3);

        System.out.println(doctorList);
        
        Connection conn=null;
        try{
        String driverName="oracle.jdbc.driver.OracleDriver";
        Class.forName(driverName);
        String serverName="Dubravka-HP";
        String serverPort="1521";
        String sid="xe";
        String url="jdbc:oracle:thin:@"+serverName+":"+serverPort+":"+sid;
        String username="ivan";
        String password="ivan";
        
        conn=DriverManager.getConnection(url,username,password);
            System.out.println("Uspesno konektovan!"); 
        
        }catch(ClassNotFoundException e){
            System.out.println("nije mogao pronaci driver"+e.getMessage());
        
        }catch(SQLException e){
            System.out.println("nije se mogao konektovati"+e.getMessage());
        
        
        };
        
        try{               

            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from SPISAKSESTARA");
            while(rs.next()){
            
            String ime= rs.getString(1).toString();
            String prezime= rs.getString(2).toString();
            int ID= rs.getInt(3);
            int JMBG=rs.getInt(4);
                System.out.println(ime+"  "+prezime+"  "+ID+" "+JMBG);
            }
      

            rs.close();
            
        }catch(Exception e){
        e.printStackTrace();
        };
        
        

        
    }
}
