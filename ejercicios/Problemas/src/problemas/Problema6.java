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
public class Problema6 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double a = obtenerMedia(informacion);
        double b = obtenerDesviacion(informacion, a);
        
        System.out.printf("Valor de la media es: %.2f\n", a);
        System.out.printf("Valor de la desviacion es: %.2f\n", b);
    }

    public static double obtenerMedia(int[] a) {
        double suma = 0;
        double media;
        for (int i = 0; i < a.length; i++) {
            suma = suma + a[i];
        }
        media = suma / a.length;
        return media;
    }

    public static double obtenerDesviacion(int[] a, double b) {
        double numerador = 0;
        for (int i = 0; i < a.length; i++) {
            numerador = numerador + (Math.pow((a[i] - b), 2));
        }
        numerador = Math.sqrt(numerador / a.length);
        return numerador;
    }
}
