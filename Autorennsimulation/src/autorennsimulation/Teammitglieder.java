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
public abstract class Teammitglieder {
    
    protected String name; 
    protected String vorname; 
    protected String nationalitaet; 
    
    public Teammitglieder(String name, String vorname, String nationalitaet) {
		this.name = name;
		this.vorname = vorname;
		this.nationalitaet = nationalitaet;
	}

}
