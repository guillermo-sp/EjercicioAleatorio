/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaleatorio;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class EjercicioAleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n1;
        String contestacion;
        int contador = 0;
        int numAleatorio = 0;
        int record = 9999;
        do {
                numAleatorio=(int) (Math.random() * 20);
            do {
                System.out.println("Adivina el numero de 0 a 20");
                n1 = teclado.nextInt();
                contador++;
                if (n1 != numAleatorio) {
                    System.out.println("Lo siento no has acertado");
                }

            } while (n1 != numAleatorio);
            System.out.println("Muy bine has acertado el numero en " + contador + " intentos");
            if(contador<record)
                System.out.println("Has superado el record");   
                record = contador;
            System.out.println("Quieres volver a jugar? S o N");

            contestacion = teclado.next();
        } while (contestacion.toUpperCase().equals("S"));
        System.out.println("Has salido del juego");
        

    }

}
