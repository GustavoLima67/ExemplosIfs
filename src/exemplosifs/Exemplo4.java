
package exemplosifs;
import java.util.Scanner;
import java.util.Random;      
public class Exemplo4 {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        String name;
        int number1 = 0;
        int number2 = 0;
        

       System.out.println("Digite seu nome:");
       name = sc.nextLine();

         for(int i = 0;i < 3; i++){
            System.out.println(r.nextInt(30)+1);
 
        }
        if (number1 >= 5 && number1 <= 1){
            System.out.println("voce " +name+ " nao esta qualificado para entrar ");
        }
        else if (number1 >= 10 && number1 <= 5){
            System.out.println("Voce " +name+ " passar com a qualificaçao minima");
        }
        else if (number1 >= 10 && number1 <=15){
            System.out.println("Voce " +name+ " passar com a qualificaçao adolecencia");
        }
        else if (number1 >= 15 && number1 <=18){
            System.out.println("Voce " +name+ " passar com a qualificaçao necesaria");
        }
        else if (number1 > 18){
            System.out.println("Voce " +name+ " pode passar com a qualificaçao otima");         
        }
         
          
               
     
    
    }
    
 }