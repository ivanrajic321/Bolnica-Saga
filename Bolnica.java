/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalizacija;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ivan
 */
public class Bolnica {
    List<Doctor> doctorList=new ArrayList<>();
    List<Nurse> nurseList=new ArrayList<>();
    public static List<Patient> patientList=new ArrayList<>();
     
    static Doctor d1=new Doctor(1231234, 12, "Dr. Gregory House", "", "24563");
    static Doctor d2=new Doctor(56956897, 7, "Dr. Gruja", "", "467234");
    static Doctor d3=new Doctor(13454345, 15, "Dr. Srdjan Cvetkovic", "", "234532");

    
    
    public static Doctor vratiDoktoraNaOsnovuImena(String ime){
        Doctor d = null;
    switch(ime){
        case "Dr. Gregory House":
            d=d1;break; 
        case "Dr. Gruja":
            d=d2;break;
        case "Dr. Srdjan Cvetkovic":
            d=d3;break;
           
        
       }
       
      return d;
    }
    
    
    
    
    
    public static void main(String[] args) {
        Bolnica b=new Bolnica();
        
        System.out.println(patientList);
        
        
    }
}
