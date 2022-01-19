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
public class Place {
    public int id;
    public String numero;
    public String etat;
    public String code_section;

    public Place(int id, String numero, String etat, String code_section) {
        super();
        this.id = id;
        this.numero = numero;
        this.etat = etat;
        this.code_section = code_section;
    }

    public Place(String numero, String etat, String code_section) {
        super();
        this.numero = numero;
        this.etat = etat;
        this.code_section = code_section;
    }

    public int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }

    public String getEtat() {
        return etat;
    }

    public String getCode_section() {
        return code_section;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public void setCode_section(String code_section) {
        this.code_section = code_section;
    }

    @Override
    public String toString() {
        return "Place{" + "id=" + id + ", numero=" + numero + ", etat=" + etat + ", code_section=" + code_section + '}';
    }
    
    
}
