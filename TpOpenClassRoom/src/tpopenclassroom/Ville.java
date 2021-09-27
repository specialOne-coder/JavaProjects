/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpopenclassroom;

/**
 *
 * @author ferdio
 */
public class Ville extends Pays{
    
    private String name;

    public Ville(String nom,String nomv, int nbreH) {
        super(nom,nbreH);
        this.name = nomv;
    }
    
    
    
}
