/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edaa.warmup.q04;

import java.util.Scanner;

/**
 *
 * @author Gabriel_Egydio
 */
public class EDAAWarmup04 {
    public static void main(String[] args) {
        System.out.println("Roubo Banco HSVC");

        var dinheiroSuspeitos = obterDinheiroSuspeitos();
        var dinheiroBandidoConfesso = obterDinheiroBandidoConfesso();

        var bandidos = avaliarBandidos(dinheiroSuspeitos, dinheiroBandidoConfesso);
        int totalRoubado = 0;

        for (int i = 0; i < bandidos.length; i++) {
            int iBandido = bandidos[i];

            System.out.println("O suspeito de nº " + (iBandido + 1) + " é um dos bandidos.");

            totalRoubado += dinheiroSuspeitos[iBandido];
        }

        System.out.println();
        System.out.print("O valor total roubado foi R$" + totalRoubado + ",00.");
    }

    private static int[] obterDinheiroSuspeitos() {
        final Scanner input = new Scanner(System.in);

        var valores = new int[10];
        int suspeitos = 0;

        while (suspeitos < 10) {
            System.out.print("Insira a quantidade de dinheir do suspeito nº " + (suspeitos + 1) + ": ");
            int quantidadeDinheiro = input.nextInt();

            if (quantidadeDinheiro < 0) {
                System.out.println();
                System.out.print("Valor não pode ser negativo. Gentileza informa um valor válido.");
                continue;
            }
            valores[suspeitos] = quantidadeDinheiro;
            suspeitos++;
        }
        return valores;
    }

    private static int obterDinheiroBandidoConfesso() {
        System.out.println();

        final Scanner input = new Scanner(System.in);
        int quantidadeRevelada = 0;

        while (quantidadeRevelada == 0) {
            System.out.print("Insira o valor revelado pelo bandido confesso: ");
            int valorRevelado = input.nextInt();

            if (valorRevelado <= 0 || valorRevelado % 10 != 0) {
                System.out.println();
                System.out.print("Favor inserir um valor válido. Os bandidos continham apenas notas de 10.");
                continue;
            }
            System.out.println();
            quantidadeRevelada = valorRevelado;
        }
        return quantidadeRevelada;
    }

    private static int[] avaliarBandidos(int[] dinheiroSuspeitos, int quantidadeBandidoConfesso) {
        var iSuspeitosBandidos = new int[0];

        for (int i = 0; i < dinheiroSuspeitos.length; i++) {
            var valorContido = dinheiroSuspeitos[i];

            if (valorContido % 10 != 0 || valorContido < quantidadeBandidoConfesso)
                continue;

            iSuspeitosBandidos = addBandido(iSuspeitosBandidos, i);
        }

        return iSuspeitosBandidos;
    }

    private static int[] addBandido(int[] iBandido, int iBandidoAdd) {
        int novoVetor = iBandido.length + 1;
        var novoIBandidos = new int[novoVetor];

        System.arraycopy(iBandido, 0, novoIBandidos, 0, iBandido.length);

        novoIBandidos[novoVetor - 1] = iBandidoAdd;

        return novoIBandidos;
    }
}