/*Jose Luis Gonzalez Cantu Tics Practica 4 - Dias Laborales y No Laborales*/
package practica.pkg4;

import java.util.Scanner;

public class Practica4 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner (System.in);
        System.out.println ("¿Cuantos dias laborales son?");
        int DiasLaborales = Scanner.nextInt();
        System.out.println ("¿Cuantos dias NO laborales son?");
        int DiasNoLaborales = Scanner.nextInt();
        System.out.println ("Los dias laborales son: " +DiasLaborales);
        System.out.println ("Los dias NO laborales son: " +DiasNoLaborales);
    }
}