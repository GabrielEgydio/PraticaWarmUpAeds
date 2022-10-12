/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.edaa.warmup.q01;

/**
 *
 * @author Gabriel_Egydio
 */
public class EDAAWarmup01 {
    public static void main(String[] args) {
        var tabuada = new int[10][10];
        criarTabuada(tabuada);
        printTabuada(tabuada);
    }

    private static void criarTabuada(int[][] tabuada) {
        for (int X = 0; X < 10; X++) {
            int valorX = X + 1;

            for (int Y = 0; Y < 10; Y++) {
                int valorY = Y + 1;
                tabuada[X][Y] = valorX + valorY;
            }
        }
    }

    private static void printTabuada(int[][] tabuada) {
        for (int Y = 0; Y < 10; Y++) {
            System.out.print("|");

            for (int X = 0; X < 10; X++) {
                System.out.print(tabuada[X][Y]);
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.print("Valor de [7][9]: " + tabuada[7 - 1][9 - 1]);
    }
}