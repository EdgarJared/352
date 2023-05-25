
package pkg5.funcmayoredad;

import java.util.Scanner;
public class FuncMayorEdad {

    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
        int numero;
        System.out.print("ingresa tu edad");
        numero = Entrada.nextInt();
        System.out.println(retornaEdad(numero));
    }
    public static String retornaEdad(int numero){
        if(numero>=18){
            System.out.println("Eres mayor de edad");
        }else if(numero<=18){
            System.out.println("Eres menor de edad");
        }
        return "ESTE ES TU CASO";
    }
}
