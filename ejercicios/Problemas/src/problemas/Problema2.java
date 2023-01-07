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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    // SANTIAGO CHAVEZ Y RAUL MEDINA
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese:\n(1) para obtener el área del cuadrado\n(2) para"
                + " obtener el áre del triangulo \n(3) para obtener el área del "
                + "rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("ERROR");
                }
            }
        }
    }

    public static void obtenerAreaCuadrado() {
        double lado;
        double area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado");
        lado = entrada.nextDouble();
        area = lado * lado * lado * lado;
        System.out.println("El área del cuadrado es: " + area);
    }

    public static void obtenerAreaTriangulo() {
        double altura;
        double base;
        double area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        area = (altura * base) / 2;
        System.out.println("El área del triangulo es: " + area);
    }

    public static void obtenerAreaRectangulo() {
        double base;
        double altura;
        double area;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de la altura");
        altura = entrada.nextDouble();
        System.out.println("Ingrese el valor de la base");
        base = entrada.nextDouble();
        area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
    }


}