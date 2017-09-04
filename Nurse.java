/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalizacija;

/**
 *
 * @author Ivan
 */
public class Nurse extends Person{
    private int ID;
    private Doctor doctor;

    public Nurse(int ID, Doctor doctor, String ime, String prezime, String JMBG) {
        super(ime, prezime, JMBG);
        this.ID = ID;
        this.doctor = doctor;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

  
}
