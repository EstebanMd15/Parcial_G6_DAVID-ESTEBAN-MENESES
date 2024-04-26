/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_1.g5_estebanmeneses;

/**
 *
 * @author idiomas
 */
public class Moto {
    private String placa;
    private int modelo;
    private int cilindraje;
  // CONSTRUCTOR 

    public Moto(String placa, int modelo, int cilindraje) {
        this.placa = placa;
        this.modelo = modelo;
        this.cilindraje = cilindraje;
    }
    
    
  //GETTERS Y SETTERS 
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getModelo() {
        return modelo;
    }
 
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }
    public static void main(String[] args){
        Moto MiMoto = new Moto ("DPS36", 2021, 150);
        MiMoto.cilindraje = 150;
        MiMoto.modelo = 2021;
        MiMoto.placa = "DPS36";
}
}
