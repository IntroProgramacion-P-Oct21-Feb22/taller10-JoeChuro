/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete3;

/**
 *
 * @author jooec
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (notasCuantitativas[i][j] >= 0 || notasCuantitativas[i][j] <= 2.9) {
                    notasCualitativas[i][j] = "Insuficiente";
                } else {
                    if (notasCuantitativas[i][j] >= 3 || notasCuantitativas[i][j] <= 4.9) {
                        notasCualitativas[i][j] = "Regular";
                    } else {
                        if (notasCuantitativas[i][j] >= 5 || notasCuantitativas[i][j] <= 7.9) {
                            notasCualitativas[i][j] = "Buena";
                        } else {
                            if (notasCuantitativas[i][j] >= 8 || notasCuantitativas[i][j] <= 9.5) {
                                notasCualitativas[i][j] = "Muy buena";
                            } else if (notasCuantitativas[i][j] >= 9.6 || notasCuantitativas[i][j] <= 10) {
                                notasCualitativas[i][j] = "Sobesaliente";
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < notasCualitativas.length; i++) {
            for (int j = 0; j < notasCualitativas.length; j++) {
                System.out.printf("\nNota Cualitativa: %s", notasCualitativas[i][j]);
            }
            
        }
    }
}
