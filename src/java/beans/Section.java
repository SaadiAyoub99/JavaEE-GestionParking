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
public class Section {

    public int id_section;
    public String code_section;
    public String nom_park;

    public Section(int id_section, String code_section, String nom_park) {
        super();
        this.id_section = id_section;
        this.code_section = code_section;
        this.nom_park = nom_park;
    }

    public Section(String code_section, String nom_park) {
        super();
        this.code_section = code_section;
        this.nom_park = nom_park;

    }

    public Section(int id_section, String code_section) {
        this.id_section = id_section;
        this.code_section = code_section;
    }

    public int getId_section() {
        return id_section;
    }

    public String getCode_section() {
        return code_section;
    }

    public String getNom_park() {
        return nom_park;
    }

    public void setId_section(int id_section) {
        this.id_section = id_section;
    }

    public void setCode_section(String code_section) {
        this.code_section = code_section;
    }

    public void setNom_park(String nom_park) {
        this.nom_park = nom_park;
    }

    @Override
    public String toString() {
        return "Section{" + "id_section=" + id_section + ", code_section=" + code_section + ", nom_park=" + nom_park + '}';
    }

}
