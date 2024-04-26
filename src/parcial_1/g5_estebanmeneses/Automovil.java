/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_1.g5_estebanmeneses;

/**
 *
 * @author idiomas
 */
public class Automovil {

    /**
     * @return the placa
     */
    
    private String placa;
    private int modelo;
    private double precio;
    
//CONSTRUCTOR
    
    public Automovil(String placa, int modelo, double precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }
   // Getters y Setters  
    
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
       
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }  
    public static void main(String[] args){
        Automovil Coche1 = new Automovil("jdk25", 2020, 25000000);
        Coche1.placa = "jdk25";
        Coche1.modelo = 2022;
        Coche1.precio = 25000000;
        
}
}