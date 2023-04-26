/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
       Hospital miHospital = new Hospital();
       
        
        // Dar valores a los atributos
        System.out.println("ingrese el nombre del Hospital");
        String nombre=sc.next();
        miHospital.establecerNombre(nombre);
         System.out.println("ingrese el numero de camas");
        int cama=sc.nextInt();
        miHospital.establecerNumeroCamas(cama);
         System.out.println("ingrese el presupuesto");
        double presupuesto=sc.nextDouble();
        miHospital.establecerPresupuesto(presupuesto);

        // Los valores ingresados por teclado
        System.out.printf("%s - %d - %.2f\n", miHospital.obtenerNombre(), 
                miHospital.obtenerNumeroCamas(), miHospital.obtenerPresupuesto());
        
        
        // Presentar los valores del objeto
    }

}
