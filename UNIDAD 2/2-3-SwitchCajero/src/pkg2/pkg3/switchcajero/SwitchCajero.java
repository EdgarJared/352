
package pkg2.pkg3.switchcajero;
import java.util.Scanner;
/**
 *
 * @author edgar jared
 */
public class SwitchCajero {
    public static void main(String[] args) {
    //variables
    final int saldo_inicial=1000; 
    int opcion;
    double ingreso,saldoActual,retiro;
    Scanner entrada=new Scanner (System.in);
    System.out.println("1.INGRESA EL DINERO A LA CUENTA");
    System.out.println("2.RETIRAR  EL DINERO A LA CUENTA");
    System.out.println("3. SALIR");
    
    System.out.print("ingresar un numero");
    opcion=entrada.nextInt();
    switch(opcion){
        
        case 1:
        System.out.println("digite la cantidad que desea");
        ingreso=entrada.nextDouble();
        saldoActual=saldo_inicial+ingreso;
        System.out.println("el saldo actual es:"+ saldoActual);
        break;
        case 2:
            System.out.println("digite la cantidad que desea");
        ingreso=entrada.nextDouble();
        saldoActual=saldo_inicial+ingreso;
        System.out.println("el saldo actual es:"+ saldoActual);
        
    }
    
        else {
        System.out.println("no cuenta con el saldo");
    }
    break;
               
    
case 3:
    }
}