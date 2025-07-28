
package nikka;

import java.util.Scanner;
public class Nikka {

   
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

      
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        if (num == 0) {
            System.out.println("Inputted number Zero");
        } else if ((num / 2) * 2 == num) {
            System.out.println("Inputted number is even");
        } else {
            System.out.println("Inputted number is odd");
        }

        }

    }
