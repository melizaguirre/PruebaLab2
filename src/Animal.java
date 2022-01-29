/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author BAC
 */
public class Animal {
    private String nombreCient;
    private String nombreComun;
    private String habitat;
    private String alimento;
    private String rasgos;
    private String distribucion;
    public int vida;
    
    public Animal(String nombreCient, String nombreComun, String habitat, String alimento, String rasgos, String distribucion, int vida){
        this.nombreCient = nombreCient;
        this.nombreComun = nombreComun;
        this.habitat = habitat; 
        this.alimento=alimento;
        this.rasgos = rasgos;
        this.distribucion = distribucion;
        this.vida = vida;
    }

   

    public String getNombreCient() {
        return nombreCient;
    }

    public void setNombreCient(String nombreCient) {
        this.nombreCient = nombreCient;
    }

    public String getNombreComun() {
        return nombreComun;
    }

    public void setNombreComun(String nombreComun) {
        this.nombreComun = nombreComun;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public String getRasgos() {
        return rasgos;
    }

    public void setRasgos(String rasgos) {
        this.rasgos = rasgos;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Animal" + "nombreCient=" + nombreCient + ", nombreComun=" + nombreComun + ", habitat=" + habitat + ", alimento=" + alimento + ", rasgos=" + rasgos + ", distribucion=" + distribucion + ", vida=" + vida + '}';
    }

    public void imprimir(){
        System.out.println("**** Datos del Animal****\n"+
        "Nombre cientifico: " + nombreCient +
        "\nNombre Comun: " + nombreComun +
        "\nHabitat: " + habitat +
        "\nAlimentacion: " + alimento +
        "\nRasgos: " + rasgos +
        "\nDistribucion: " + distribucion +
        "\nVida: " + vida );         
    }
    
}
