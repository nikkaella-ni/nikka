
package reston;

import java.util.Scanner;
public class reston {
     public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
        int num;
        System.out.print("Enter A Number: ");
        num=scanner.nextInt();
        if(num==0){
            System.out.println("Inputted Number Zero");
        }
        else if(num<0){
            System.out.println("Inputted Number is Negative");
            
        }
        else if(num>0){
            System.out.println("Inputted Number is Positive");
        }
        
        
    }
    
}

