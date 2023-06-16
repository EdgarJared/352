/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12.banderascalificacion;
import java.util.Scanner;

/**
 *
 * @author edgar jared
 */
public class Banderascalificacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner Scanner = new Scanner(System.in);
       
         int cali= 7;
         int calif = 10;
         
         boolean cal1;

         System.out.println("Ingresa tu calificacaión: ");
         cali = Scanner.nextInt();
         cal1 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal1);
         
         System.out.println("");
         
         boolean cal2;
         
         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
         cal2 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal2);
         
         System.out.println(" ");
         
         boolean cal3;

         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
         cal3 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal3);
         
         System.out.println(" ");
         
         boolean cal4;

         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
          cal4 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado" + cal4);
         
         System.out.println(" ");
         
         boolean cal5;
         
         System.out.println("Ingresa tu calificación");
         cali = Scanner.nextInt();
         cal5 = (cali>=7 && calif<=10 );
         System.out.println("Estás aprobado:" + cal5);
        
    }
    
}
