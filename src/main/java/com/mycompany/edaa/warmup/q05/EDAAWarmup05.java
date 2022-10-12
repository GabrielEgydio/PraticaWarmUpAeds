/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edaa.warmup.q05;

import java.util.Scanner;

/**
 *
 * @author Gabriel_Egydio
 */
public class EDAAWarmup05 {
    public static void main(String[] args) {
        final Scanner input = new Scanner(System.in);

        int[] numerosEscritaUnica = new int[5];
        boolean[] numerosEscritaUnicaBoolean = new boolean[5];

        var numero = 0;

        for (int i = 0; i < numerosEscritaUnica.length; i++) {
            System.out.println("Insira um valor inicial para o " + (i + 1) + "º número: ");
            numerosEscritaUnica[i] = input.nextInt();
        }

        for (int i = 0; numero >= 0; i++) {
            System.out.println("Insira um valor para o " + (i + 1) + "º número: ");
            numero = input.nextInt();

            if (i == 4) {
                break;
            }

            if (numerosEscritaUnica[i] != numero && numerosEscritaUnicaBoolean[i] != true) {
                numerosEscritaUnica[i] = numero;
                numerosEscritaUnicaBoolean[i] = true;
            }

            System.out.println("O valor atual do " + (i + 1) + "º número é " + numerosEscritaUnica[i] + ".");

        }
    }
}