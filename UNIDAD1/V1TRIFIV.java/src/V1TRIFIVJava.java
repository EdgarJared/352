
package com.mycompany.v1trifiv.java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class V1TRIFIVJava {

    public static void main(String[] args) throws IOException{
        //Declaracion de variables
        int numero;
        int mult3;
        int mult5;
        BufferedReader bufEntrada = new BufferedReader (new InputStreamReader(System.in));
        //entrada de datos
        System.out.println("Dame el elemento");
        numero = Integer.parseInt(bufEntrada.readLine());
        //procesamiento de datos
        mult3 = numero %3;
        mult5 = numero %5;
        //salida de datos
        if(mult3 == 0) {System.out.println("TRI");}
        if(mult5 == 0) {System.out.println("FIV");}
        if (mult3 ==0 && mult5 ==0){ System.out.println("imprime TriFiv");}
    }
}
