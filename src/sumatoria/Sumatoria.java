/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumatoria;

import java.util.Scanner;

/**
 *
 * @author HACKER
 */
public class Sumatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("introdusca un numero, el cual desea saber su sumatoria");
        num = leer.nextInt();
        System.out.println(Sumatorio(num));
    }

    private static int Sumatorio(int iNumero) {//metodo recursivo para calcular la sumatoria
        if (iNumero == 0) {//condicion o caso base
            return 0;
        } else {//entonces
            return iNumero + Sumatorio(iNumero - 1);//se hace la suma y se llama asi mismo el metodo creando un bucle y terminara cuando se cumpla la condision o el caso base
        }
    }

}
