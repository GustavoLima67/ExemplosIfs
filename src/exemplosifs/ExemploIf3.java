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
public class ExemploIf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
   
        String name;
        int idade ;
        String name1;
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("digite seu nome:");
        name = sc.nextLine();
        
        System.out.println("digite sua idade:");
        idade = sc.nextInt();
        
        
        
   
    if (idade>=15) {
        
    System.out.println("Voce " +name+ " tem permissao para jogar");
    System.out.println("Bem vido ao melhor jogo fps ja existido");
   }
   
    else if(idade<15 && idade>=10) {
    System.out.println("Voce " +name+ " nao tem permissao para jogar");
   }
    
    else  {
    System.out.println("Voce " +name+ " nao tem as qualificaçoes neccesaria para joga");
   }
         
    
    
   
    
    
    }
}