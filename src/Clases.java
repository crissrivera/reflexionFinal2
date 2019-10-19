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
public class Clases {
    ArrayList<String> atributo;
    ArrayList<String> metodo;
    String nombre;
    
    
    public Clases (){
        atributo=new ArrayList<>();
        metodo=new ArrayList<>();
    }

    public ArrayList<String> getAtributo() {
        return atributo;
    }

    public void setAtributo(ArrayList<String> atributo) {
        this.atributo = atributo;
    }

    public ArrayList<String> getMetodo() {
        return metodo;
    }

    public void setMetodo(ArrayList<String> metodo) {
        this.metodo = metodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
