
package pkg4.v3trifiv;

import java.util.Scanner;
public class V3TRIFIV {

    public static void main(String[] args) {
     //declaracion de variables
     Scanner entrada = new Scanner(System.in);
     int numero;
     //entrada de datos 
     System.out.println("DAME EL NUMERO");
     numero = entrada.nextInt();
     //salida de datos 
     System .out.println(retornoMultiplo(numero));
    }
    
    public static String retornoMultiplo(int num){
        //DECLARACION DE VARIABLES
        int mult3;
        int mult5;
        //PROCESAMIENTO DE DATOS
        mult3 = num % 3;
        mult5 = num % 5;
        //SALIDA DE DATOS
        if (mult3 ==0 && mult5 ==0){
            return "TRIFIV";
        } else if (mult3==0){
            return "TRI";
        }else if (mult5==0){
            return "FIV";
        }
        return "NINGUN CASO";
    }
}
