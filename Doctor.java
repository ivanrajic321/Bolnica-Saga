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
public class Doctor  extends Person {
    private int ID;
    private int brojOrdinacije;
    
    public Doctor(int ID, int brojOrdinacije, String ime, String prezime, String JMBG) {
        super(ime, prezime, JMBG);
        this.ID = ID;
        this.brojOrdinacije = brojOrdinacije;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getBrojOrdinacije() {
        return brojOrdinacije;
    }

    public void setBrojOrdinacije(int brojOrdinacije) {
        this.brojOrdinacije = brojOrdinacije;
    }
    
    
}
