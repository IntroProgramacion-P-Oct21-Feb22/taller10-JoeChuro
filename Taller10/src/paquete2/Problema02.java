/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jooec
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[] vendedores={"Jesica","Colle"};
        int[][] ventas = new int[2][5];
        int[] totalVentas = new int[2];
        int suma=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Ventas del vendedor 1: ");
            ventas[0][i]= entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Ventas del vendedor 2: ");
            ventas[1][i]= entrada.nextInt();
            }
        for (int i = 0; i < 5; i++) {
            suma=suma+ventas[0][i];
            totalVentas[0]=suma;
        }
        suma=0;
        for (int i = 0; i < 5; i++) {
            suma=suma+ventas[1][i];
            totalVentas[1]=suma;
        }
        for (int i = 0; i < 2; i++) {
            System.out.printf("\nVendedor: %s"+"Ha realizado un total de %d en ventas."
                    , vendedores[i],totalVentas[i]);
        }
        
    }
    
}
