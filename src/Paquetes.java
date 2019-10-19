/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author Crist
 */
public class Paquetes {
    //lista de paquetes
     ArrayList<Paquetes> paquetes;
     String nombres;
     //lista de clases
    ArrayList<Clases> clases;

    public Paquetes() {
        paquetes = new ArrayList<>();
        clases =  new ArrayList<>();
    }

    public ArrayList<Paquetes> getPaquetes() {
        return paquetes;
    }

    public void setPaquetes(ArrayList<Paquetes> paquetes) {
        this.paquetes = paquetes;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }
    
    
}
