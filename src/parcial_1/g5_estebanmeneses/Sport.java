/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_1.g5_estebanmeneses;

/**
 *
 * @author idiomas
 */
public class Sport extends Moto {
private String motor;
private String potencia;
private String tanque;

    public Sport(String motor, String potencia, String tanque, String placa, int modelo, int cilindraje) {
        super(placa, modelo, cilindraje);
        this.motor = motor;
        this.potencia = potencia;
        this.tanque = tanque;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public String getTanque() {
        return tanque;
    }

    public void setTanque(String tanque) {
        this.tanque = tanque;
    }
    //************************************
    public String motorGarantia() {
        if (motor.equals("4T")) {
            return "La garantía de la moto es por 2 años";
        } else if (motor.equals("monocilindrico")) {
            return "La garantía de la moto es por 1 año";
        } 
    return null;
   
    }
}