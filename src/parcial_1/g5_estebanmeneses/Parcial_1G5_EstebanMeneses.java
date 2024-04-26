/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcial_1.g5_estebanmeneses;
import javax.swing.JOptionPane;

public class Parcial_1G5_EstebanMeneses {


    public static void main(String[] args) {
 
        int opcion;

        do {
            opcion = mostrarMenu();

            switch(opcion) {
                case 1 -> registrarAutomovil();
                case 2 -> registrarMoto();
                case 3 -> mostrarVendedor();
                case 4 -> JOptionPane.showMessageDialog(null, "Saliendo del menu..");
               
            }
        } while (opcion != 4);
    }

    public static int mostrarMenu() {
 
       String menu = """
                    ****CONCESIONARIO DE VEHICULOS DEL CAUCA****
                    **** REGISTRO DE VEHICULO VENDIDOS****\n 
                      1. Registro de automoviles                    
                      2. Registro de motos                     
                      3. Vendedor                     
                      4. Salir
                      
                      Ingrese su opcion:""";
        return Integer.parseInt(JOptionPane.showInputDialog(null, menu));
    }

    public static void registrarAutomovil() {
      JOptionPane.showMessageDialog(null, "La placa deL vehiculo es: jdk25"+"\n"+
        "El precio del vehiculo es de: 25000000"+"\n"+
        "El modelo de la moto es: 2022"+"\n"+
              "el automovil cuenta con frenos ABS");
    }

    public static void registrarMoto() {
        JOptionPane.showMessageDialog(null, "La placa de la moto es: DPS36"+"\n"+
        "El cilindraje de la moto es de: 150cc"+"\n"+
        "El modelo de la moto es: 2021"+"\n"+
                "La moto es 4T por lo tanto tiene una garantia de 2 años");
    }

    public static void mostrarVendedor() {
        JOptionPane.showMessageDialog(null, "El nombre completo del vendedor  es: DAVID ESTEBAN MENESES DIAZ.");
    }


    }
   

