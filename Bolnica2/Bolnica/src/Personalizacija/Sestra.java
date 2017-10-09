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
public class Sestra extends Osoba{
    private String ID;


    public Sestra(String ID, String ime, String prezime, String JMBG) {
        super(ime, prezime, JMBG);
        this.ID = ID;
       
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Sestra{" + " Ime="+getIme() +" Prezime= "+getPrezime()+ "ID=" + ID +" JMBG="+getJMBG()+ '}';
    }


  
}
