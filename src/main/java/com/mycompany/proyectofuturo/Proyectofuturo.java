/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectofuturo;

/**
 *
 * @author ADAYA ELIAS GRACIA
 */
public class Proyectofuturo {

    public static void main(String[] args) {
     
        System.out.println("Estudiante " + args[0] + "  "+ args[1]);
        
        System.out.println(veredicto(args[3],args[2]));
    }
    
   private static String veredicto(String valor1, String valor2) {
       if (valor1.equals(valor2)) {
            return "Bien. Esfuerzate mas";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
            return "Poco tiempo de estudio.";
        }
        return "Ideal. Sigue así.";
    }
}
