
package pkg9.descdiasemana;
import java.util.Scanner;

/**
 *
 * @author edgar jared
 */
public class Descdiasemana {
  static double pago, monto, iva ;
    static String dia;

    public static void main(String[] args) {
pedirDatos();
        compra(pago, monto, iva, dia);
    }
    
    public static void pedirDatos(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el monto de la compra:");
        monto = entrada.nextInt();
        System.out.println("Escriba el dia de la compra:");
        dia = entrada.next();
        
    }
    
    public static void compra(double pago, double monto, double iva, String dia){
       double res;
        String dias = dia.toLowerCase();
        if ("martes".equals(dias) || "jueves".equals(dias)) {
            pago = (monto-(monto * 0.20));
             iva = pago * 0.16;
             res = pago + iva;
             System.out.println("FELICIDADES!! Hoy es "+dias+" dia de descuento.");
             System.out.println(" El total a pagar es = "+res);
        }else{
            System.out.println("Hoy NO es dia de descuento...");
            System.out.println("El total a pagar es: "+monto);
        }
   
    }
}