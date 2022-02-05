/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        char inicial;
        String vinicial;
        String inicialv;
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes.length; j++) {
                inicial=estudiantes[i][j].charAt(0);
                vinicial=String.valueOf(inicial);
                inicialv=String.valueOf(inicial);
                if(inicialv.equals("vinicial")){
                System.out.println(estudiantes[i][j]);
                }
            }
        }
    }
}
