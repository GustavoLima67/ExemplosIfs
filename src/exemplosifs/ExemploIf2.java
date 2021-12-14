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
public class ExemploIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        //variaveis //

	   String funcionario;
	   double salario;
	   double reajuste;
	   double salariofinal;

	  //Entrada de Dados//

	   Scanner  sc = new Scanner(System.in);

	  System.out.println("Digite o nome do funcionario:");
      funcionario = sc.nextLine();

	   System.out.println("Digite o salario do funcionário R$:");
      salario = sc.nextDouble();
		  
      if(salario>=1500)
	  {
           //bloco do código//

		  reajuste = salario * 10/100;
          salariofinal=salario+reajuste;

                 System.out.println("O nome do funcionario:"+funcionario +
		       "\nO salario do funcionario R$:"+ salario +
		       "\n A faixa de reajuste é 10%"+
		       "\n O valor do reajuste é R$:"+reajuste+
		       "\n O salario final com reajuste R$:"+salariofinal);
	  
	  }
	  else {
          reajuste = salario * 20/100;
          salariofinal=salario+reajuste;

		  System.out.println("O nome do funcionario:"+funcionario +
			 "\nO salario do funcionario R$:"+ salario +
			 "\n A faixa de reajuste é 20%"+
			 "\n O valor do reajuste é R$:"+reajuste+
			 "\n O salario final com reajuste R$:"+salariofinal);

		  
	  }
        
        
         }
         
}
