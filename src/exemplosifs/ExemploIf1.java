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
public class ExemploIf1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int numero1 ;
	  int numero2 ;
	  
	  
	  
	  Scanner sc = new Scanner(System.in);


	  System.out.println("Digite o 1 numero:");

	  numero1 = sc.nextInt();

	  
	  System.out.println("Digite o 2 numero:");

	  numero2 = sc.nextInt();

          if(numero1>numero2)
	 {
          System.out.println("O numero 1 digitado é maior que o numero 2");
		 
	 }
           
	  else {


          System.out.println("O numero 1 digitado é menor que o numero 2");
         } 
    
    
   
    
    }
    
}
