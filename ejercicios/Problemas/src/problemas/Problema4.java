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
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        int cedula;
        String nombre;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese su nombre por favor");
            nombre = entrada.nextLine();
            System.out.println("Ingrese su cedula por favor");
            cedula = entrada.nextInt();
            System.out.println("Ingrese \n1 para obtener el valor de la "
                    + "plantilla de luz\n2 para obtener el predio del "
                    + "inmueble");
            opcion = entrada.nextInt();

            if (opcion == 1) {
                calcularValorLuz(nombre, cedula);
            } else {
                if (opcion == 2) {
                    calcularPredio(nombre, cedula);
                }
            }

            System.out.println("Ingrese cualquier numero para salir");
            opcion = entrada.nextInt();
            if (opcion != 1 && opcion != 2) {
                bandera = false;
            }
        }
    }

    public static void calcularValorLuz(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorkilovatio;
        double kilovatio;
        double operacion;
        System.out.println("Ingrese el valor del kilovatio");
        valorkilovatio = entrada.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos");
        kilovatio = entrada.nextDouble();

        operacion = valorkilovatio * kilovatio;
        System.out.printf("Cliente %s con cedula %s debe cancelar el valor"
                + "de $%.0f", nombre, cedula, operacion);

    }

    public static void calcularPredio(String nombre, int cedula) {
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        double valorPredio;
        System.out.println("Ingrese el valor del Inmueble");
        valorInmueble = entrada.nextDouble();
        valorPredio = valorInmueble * 0.02;
        System.out.printf("Cliente %s con cedula %s tiene un bien"
                + "inmueble valorado en $%.0f y tiene que pagar de predio $%.0f",
                 nombre, cedula, valorInmueble, valorPredio);
    }
}
