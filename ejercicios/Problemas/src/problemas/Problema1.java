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
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    
    // SANTIAGO CHAVEZ Y RAUL MEDINA
    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        imprimirDatos(informacion);

    }

    public static void imprimirDatos(int[][] dato) {
        //int num;
        for (int i = 0; i < dato.length; i++) {
            for (int j = 0; j < dato[i].length; j++) {

                int numero = dato[i][j];
                if (numero % 2 == 0) {
                    System.out.printf("El numero par es: %d\n", numero);

                }

            }
           

        }

    }

}
