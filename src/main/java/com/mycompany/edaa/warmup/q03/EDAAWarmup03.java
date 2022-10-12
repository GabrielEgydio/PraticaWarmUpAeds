/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.edaa.warmup.q03;

import java.text.DecimalFormat;

/**
 *
 * @author Gabriel_Egydio
 */
public class EDAAWarmup03 {
    private static final DecimalFormat decimalFormatter = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        var modelos = buscarModelos();
        var consumo = buscarConsumo();
        
        System.out.println("Carros X KM/Litro");
        
        for(int i=0; i<modelos.length; i++) {
            var carro = modelos[i];
            var kmL = consumo[i];
            
            System.out.println(carro + " | " + kmL + "Km/L");
        }
                
        System.out.println();
        
        avaliarKmLCarros(modelos, consumo);
    }
    
    private static String[] buscarModelos() {
        return new String[] {"Opala", "Civic", "Fusion", "Rav4", "Uno"};
    }
    
    private static double[] buscarConsumo() {
        return new double[] {4.8, 9.1, 11.7, 9.3, 13.4};
    }
    
    private static void avaliarKmLCarros(String[] carros, double[] consumos) {
        double menorConsumo = Integer.MAX_VALUE;
        String maisEconomico = null;
        
        System.out.println("Carros X KM/L por 1000Km");
        
        for(int i=0; i<carros.length; i++) {
            var carro = carros[i];
            var kmLitro = consumos[i];
            
            double consumoMilKm = 1000 / kmLitro;
            
            System.out.println(carro + " | " + decimalFormatter.format(consumoMilKm) + "L");
            
            if (consumoMilKm < menorConsumo) {
                menorConsumo = consumoMilKm;
                maisEconomico = carro;
            }
        }       
        System.out.println();     
        System.out.println("O modelo de carro mais econômico é o " + maisEconomico + ".");
    }
}
