/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] notasEstudiantes = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedios = new double[3];
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < 4; i++) {
            suma = suma + notasEstudiantes[0][i];
            promedio = suma / 4;
            promedios[0] = promedio;
        }
        suma = 0;
        promedio = 0;
        for (int i = 0; i < 4; i++) {
            suma = suma + notasEstudiantes[1][i];
            promedio = suma / 4;
            promedios[1] = promedio;
        }
        suma = 0;
        promedio = 0;
        for (int i = 0; i < 4; i++) {
            suma = suma + notasEstudiantes[2][i];
            promedio = suma / 4;
            promedios[2] = promedio;
        }
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.printf("\nEstudiante: %s tiene un promedio de: %.2f",
                    estudiantes[i],
                    promedios[i]);

        }
    }

}
