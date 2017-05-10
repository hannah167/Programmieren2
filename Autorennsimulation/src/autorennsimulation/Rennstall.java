/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autorennsimulation;


public class Rennstall {
    
    private Teammitglieder[] mengeTeammitglieder = new Teammitglieder[5];
    private Rennwagen[] mengeRennwagen = new Rennwagen[3];
 
    private String teamname;
    private String sponsor;
    
    public Rennstall(String teamname, String sponsor) {
		this.teamname = teamname;
		this.sponsor = sponsor;
	}
}
