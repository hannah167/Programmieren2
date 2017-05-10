/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorennsimulation;

/**
 *
 * @author Hannah
 */
public class Pilot extends Teammitglieder {
    
    private int nummer;
    private int anzahlSiege;
    
    public Pilot(String name, String vorname, String nationalitaet, int nummer, int anzahlSiege) {
		super(name, vorname, nationalitaet);
		this.nummer = nummer;
		this.anzahlSiege = anzahlSiege;
	}

}

