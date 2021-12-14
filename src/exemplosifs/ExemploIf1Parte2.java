/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplosifs;

import java.util.Scanner;

/**
 *
 * @author Gustavo
 */
public class ExemploIf1Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
           int numero;
        
	   Scanner sc = new Scanner(System.in);


	   System.out.println("Digite o 1 numero:");

	   numero = sc.nextInt();

	    
	   if(numero % 2==0)
               
	   {
           System.out.println("O numero é par");
		 
	   }
           else
               
           {
           System.out.println("O numero é impar");
           } 
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
