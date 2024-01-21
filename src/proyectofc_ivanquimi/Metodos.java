/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofc_ivanquimi;


import java.util.Arrays;
import java.util.Scanner;

import java.util.Scanner;

public class Metodos {

    char[][] matriz;

    public int[] ingresarTamanioMatriz() {
        Scanner sc = new Scanner(System.in);                               /*1*/

        System.out.print("Ingrese el tamaño de la matriz cuadrada (MxM): ");  
        int size = sc.nextInt();                                                /*2*/

        return new int[]{size};                                                 
    }

    public int[] ingresarCaracter() {
        Scanner sc = new Scanner(System.in);

        // Ingresar un solo carácter
        char caracter;                                                          /*1*/
        do {                                                                    /*2*/
            System.out.print("Ingrese un único carácter: ");
            caracter = sc.next().charAt(0);                                /*3*/
        } while (!Character.isLetter(caracter));

        return new int[]{caracter};
    }

    
    public void inicializarMatriz(int size, char caracter) {                    /*1*/
        matriz = new char[size][size];                                          /*2*/
        // Llenar la matriz con el carácter ingresado
        for (int i = 0; i < size; i++) {                                        /*3*/
            for (int j = 0; j < size - i; j++) {                                /*4*/
                matriz[i][j] = caracter;                                        /*5*/
            }
        }
    }



    public void mostrarMatrizAscendente() {
        if (matriz == null || matriz.length == 0) {                             /*1*/
            System.out.println("No se han ingresado datos en la matriz. "
                    + "Por favor, ingrese datos.");
            return;
        }

        System.out.println("Matriz de forma ascendente:");
        for (int i = matriz.length - 1; i >= 0; i--) {                          /*2*/
            for (int j = 0; j < matriz[i].length; j++) {                        /*3*/
                if (j < matriz[i].length - i) {                                 /*4*/
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatrizDescendente() {
        if (matriz == null || matriz.length == 0) {                             /*1*/
            System.out.println("No se han ingresado datos en la matriz. "
                    + "Por favor, ingrese datos.");
            return;
        }

        System.out.println("Matriz de forma descendente:");
        for (int i = 0; i < matriz.length; i++) {                               /*2*/
            for (int j = 0; j < matriz[i].length; j++) {                        /*3*/
                if (j < matriz[i].length - i) {                                 /*4*/
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatrizAscendenteAsteriscos(int size) {                   /*1*/
        System.out.println("Matriz de forma ascendente (con asteriscos):");
        for (int i = size - 1; i >= 0; i--) {                                   /*2*/
            for (int j = 0; j < size; j++) {                                    /*3*/
                if (j < size - i) {                                             /*4*/
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public void mostrarMatrizDescendenteAsteriscos(int size) {                  /*1*/
        System.out.println("Matriz de forma descendente (con asteriscos):");
        for (int i = 0; i < size; i++) {                                        /*2*/
            for (int j = 0; j < size - i; j++) {                                /*3*/
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
