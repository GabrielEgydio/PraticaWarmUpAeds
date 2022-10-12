/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edaa.warmup.q02;

import java.util.Random;

/**
 *
 * @author Gabriel_Egydio
 */
public class EDAAWarmup02 {
    public static void main(String[] args) {
        var numeros = gerarNumeros();

        System.out.println();
        System.out.println();

        verificarNumerosPrimos(numeros);
    }

    private static int[] gerarNumeros() {
        var random = new Random();
        var numeros = new int[10];

        System.out.println("Números gerados: ");

        for (int i = 0; i < 10; i++) {
            var novoNumero = random.nextInt(100);

            numeros[i] = novoNumero;

            System.out.print(novoNumero + "|");
        }
        return numeros;
    }

    private static boolean numeroPrimo(int numero) {
        if (numero <= 1)
            return false;

        for (int d = 2; d < numero; d++) {
            if (numero % d == 0) {
                return false;
            }
        }
        return true;
    }

    private static void verificarNumerosPrimos(int[] numeros) {
        System.out.println("Números Verificados");

        for (int i = 0; i < 10; i++) {
            var numero = numeros[i];

            if (numeroPrimo(numero))
                System.out.println("O número " + numero + " na posição " + i + " é primo.");
            else
                System.out.println("O número " + numero + " na posição " + i + " NÃO é primo.");
        }
    }
}