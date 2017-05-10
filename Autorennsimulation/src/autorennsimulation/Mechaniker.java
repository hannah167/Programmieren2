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
public class Mechaniker extends Teammitglieder {
    
    private String spezialgebiet;

	public Mechaniker(String name, String vorname, String nationalitaet, String spezialgebiet) {
		super(name, vorname, nationalitaet);
		this.spezialgebiet = spezialgebiet;
	}

}