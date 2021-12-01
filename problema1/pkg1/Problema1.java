/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1.pkg1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Pablo Figueroa
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre;
        String apellido;
        String cadenaF = "";
        double sueldo; 
        double hijo1; 
        double hijo2; 
        double hijo3; 
        double total;
        boolean condicion = true;
        String salida; 
        
        while (condicion) {
            
        System.out.println("Ingrese sus nombres ");
        nombre = entrada.nextLine (); 
        System.out.println("Ingrese sus apellidos ");
        apellido = entrada.nextLine ();
        System.out.println("Ingrese su sueldo ");
        sueldo = entrada.nextDouble ();
        System.out.println("Ingrese los gastos de su primer hijo ");
        hijo1 = entrada.nextDouble ();
        System.out.println("Ingrese los gastos de su segundo hijo ");
        hijo2 = entrada.nextDouble ();
        System.out.println("Ingrese los gastos de su tercer hijo ");
        hijo3 = entrada.nextDouble ();
        
        total = hijo1 + hijo2 + hijo3 ;
        if (sueldo < total) {
            cadenaF = (cadenaF +"El padre de familia " + nombre + " " + apellido +
                    " sueldo semanal:  $" + sueldo + " Numero de hijos: 3\n"
                    + "Reporte de gastos \n" + "Hijo 1, gasta semanalmente: " + hijo1
                    + "\n" + "Hijo 2, gasta semanalmente: " + hijo2 + "\n" + ""
                    + "Hijo 3, gasta semanalmente: " + hijo3 + "\n" + 
                    "Total de gasto en hijos: " + total + "\n" + "El padre de familia "
                    + nombre + " " + apellido + " le falta el dinero semanalmente " + "\n" + "\n");
        }
         if (sueldo >= total) {
           cadenaF = (cadenaF + "El padre de familia " + nombre + " " + apellido +
                    " sueldo semanal:  $" + sueldo + " Numero de hijos: 3\n"
                    + "Reporte de gastos \n" + "Hijo 1, gasta semanalmente: " + hijo1
                    + "\n" + "Hijo 2, gasta semanalmente: " + hijo2 + "\n" + ""
                    + "Hijo 3, gasta semanalmente: " + hijo3 + "\n" + 
                    "Total de gasto en hijos: " + total + "\n" + "El padre de familia "
                    + nombre + " " + apellido + " le alcanza el dinero semanalmente " + "\n" + "\n");
         }
          entrada.nextLine();
         
          System.out.println("Ingrese si para salir");
            salida = entrada.nextLine();
            if (salida.equals("si")) {
                condicion = false;
            }
            
    }
      System.out.println(cadenaF);
    }
    
}
