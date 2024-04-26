/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcial_1.g5_estebanmeneses;

/**
 *
 * @author idiomas
 */
public class Sedan extends Automovil{
    public double motor;
    public boolean frenos;


    public Sedan(double motor, boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }
    public boolean freenosABS(){
        return frenos;
    }
        public static void main(String[] args) {
            
        }
    public void frenosABS() {
        if (frenos) {
            System.out.println("El automóvil tiene frenos ABS");
        } else {
            System.out.println("El automóvil no tiene frenos ABS");
        }
    }
}