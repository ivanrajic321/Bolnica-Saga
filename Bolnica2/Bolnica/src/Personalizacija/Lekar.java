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
public class Lekar  extends Osoba {
    private String ID;
    private String brojOrdinacije;
    
    public Lekar(String ID, String brojOrdinacije, String ime, String prezime, String JMBG) {
        super(ime, prezime, JMBG);
        this.ID = ID;
        this.brojOrdinacije = brojOrdinacije;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBrojOrdinacije() {
        return brojOrdinacije;
    }

    public void setBrojOrdinacije(String brojOrdinacije) {
        this.brojOrdinacije = brojOrdinacije;
    }

    @Override
    public String toString() {
        return "Lekar{" +" Ime= "+ getIme()+ " Prezime= "+ getPrezime()+ "ID=" + ID + ", brojOrdinacije=" + brojOrdinacije + " JMBG="+getJMBG()+ '}';
    }
    
    
    
}
