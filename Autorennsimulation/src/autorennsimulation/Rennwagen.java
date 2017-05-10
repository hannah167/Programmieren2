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
public class Rennwagen {
    
    private boolean defekt;
    private String pilot; 
    
    private static int anzahlRennwagen;
    public final int wagenNummer;


    public Rennwagen(boolean defekt, String pilot) {
		this.wagenNummer = anzahlRennwagen++;
		this.defekt = defekt;
		this.pilot = pilot;

	}
}