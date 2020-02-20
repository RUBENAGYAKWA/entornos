/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;
import java.util.*;
/**
 *
 * @author admin
 */
public class Practica2 {

    /**
     * 
     * @param args the command line arguments
     */
         public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc=new Scanner (System.in);
        
        double temperaturas[]=new double[7];
        String diasSemana[] = {"lunes", "martes", "miercoles","jueves", "viernes", "sabado", "domingo"};
        double suma=0;
        int dia,posMin, posMax;
       char seguir;
        sc.useLocale(Locale.ENGLISH);
        do{
        System.out.println("anota temperatura del dia");
        
        for (int i=0;i<temperaturas.length;i++){
            System.out.println(diasSemana[i] + " : ");
            temperaturas[i]=sc.nextDouble();
            suma=suma+temperaturas[i];
            
          
        
        System.out.println("la temperatura media es " + suma/7);
        
        do{
            System.out.println("anota el dia que quieras saber la temperatura");
            dia=sc.nextInt();
            
        }while (dia<1 || dia>7);
        
        System.out.println("la temperatura fue " + temperaturas[dia-1]);
    }
            System.out.println("quieres seguir");
            seguir=sc.nextLine().charAt(0);
        }while(seguir == 's');
        }
    }
    

