/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author HP
 */
public class Park {
    public int id;
    public String nom_park;

    public Park(int id, String nom_park) {
        super();
        this.id = id;
        this.nom_park = nom_park;
    }

    public Park(String nom_park) {
        super();
        this.nom_park = nom_park;
    }

    public int getId() {
        return id;
    }

    public String getNom_park() {
        return nom_park;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom_park(String nom_park) {
        this.nom_park = nom_park;
    }

    @Override
    public String toString() {
        return "Park{" + "id=" + id + ", nom_park=" + nom_park + '}';
    }
    
    
}
