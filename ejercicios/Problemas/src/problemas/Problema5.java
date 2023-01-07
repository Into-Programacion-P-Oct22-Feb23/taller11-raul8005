/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */

public class Problema5 {
    // SANTIAGO CHAVEZ Y RAUL MEDINA
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        double a = obtenerSuma(informacion);
        System.out.printf("La suma del arreglo es: %.0f    ",a);
        
    }

    public static double obtenerSuma(int [][] informacion) {
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              suma = suma + informacion[i][j];  
            }  
        }
        return suma;
        
    }
}
    

