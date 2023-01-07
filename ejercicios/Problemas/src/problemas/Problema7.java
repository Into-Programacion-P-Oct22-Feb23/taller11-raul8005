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
public class Problema7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] lista = obtenerCiudad();
        System.out.println("El nuevo arreglo es: ");
        for (String lista1 : lista) {
            System.out.printf("[%s]", lista1);
        }
        System.out.println("\nCiudades con 4 o 5 caracteres:");
        obtenerCaracteres(lista);
    }

    public static String[] obtenerCiudad() {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el el numero de elementos del arreglo:");
        numero = entrada.nextInt();
        entrada.nextLine();
        String[] cadena = new String[numero];
        for (int i = 0; i < cadena.length; i++) {
            System.out.println("Ingrese nombres de ciudades del Ecuador: ");
            String ciudad = entrada.nextLine();
            cadena[i] = ciudad;
        }
        String cadenaFinal = "";
        for (String cadena1 : cadena) {
            cadenaFinal = String.format("%s%s\n", cadenaFinal, cadena1);
        }
        return cadena;
    }

    public static void obtenerCaracteres(String[] a) {
        for (String a1 : a) {
            int caracteres = a1.length();
            if (caracteres == 4 || caracteres == 5) {
                System.out.printf("%s\n", a1);
            }
        }
    }
    
}
