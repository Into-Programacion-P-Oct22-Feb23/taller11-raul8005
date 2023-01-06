/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        //String notas = "";

        System.out.println("Ingrese la nota 1");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4");
        nota4 = entrada.nextDouble();

        String promedio = obtenerPromedio(nota1, nota2, nota3, nota4);
        //notas = String.format("%d%d%d%d", nota1, nota2, nota3, nota4);
        System.out.printf("El promedio de las notas:%.0f, %.0f, %.0f y %.0f es %s",
                nota1,
                nota2,
                nota3,
                nota4,
                promedio);
    }

    public static String obtenerPromedio(double nota1, double nota2,
        double nota3, double nota4) {
        double promedio;
        promedio = (nota1 + nota2 + nota3 + nota4) / 4;
        String calificacionCualitativa = "";
        /*String nota ="";
        nota = String.format("El promedio%d", promedio);*/
        if (promedio >= 0 && promedio <= 5) {
            calificacionCualitativa = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                calificacionCualitativa = "Bueno";
            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    calificacionCualitativa = "Muy Bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        calificacionCualitativa = "Sobresaliente";
                    }
                }
            }
        }
        
        return calificacionCualitativa;
        
    }
}
