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
public class Pacijent extends Osoba{
    private Lekar myDoctor;

    public Pacijent(Lekar myDoctor, String ime, String prezime, String JMBG) {
        super(ime, prezime, JMBG);
        this.myDoctor = myDoctor;
    }

    public Lekar getMyDoctor() {
        return myDoctor;
    }

    public void setMyDoctor(Lekar myDoctor) {
        this.myDoctor = myDoctor;
    }

    @Override
    public String toString() {
        return "Patient{" + "Ime= " +getIme()+ "Prezime= "+getPrezime()+"JMBG= "+getJMBG()+"Izabrani lekar=" + getMyDoctor() + '}';
    }
    
}
