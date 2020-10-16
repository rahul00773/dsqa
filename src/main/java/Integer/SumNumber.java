package Integer;

import java.util.Scanner;

public class SumNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int counter =0;
        int sum=0;
        while(counter!=2){
            int order = counter+1;
            System.out.println("Enter Number#" + order + ":");
            boolean hasNextInt = sc.hasNextInt();
            if(hasNextInt){
                int number  = sc.nextInt();
                counter++;
                sum+=number;
            }
            else{
                System.out.println("number is not valid");
                sc.nextInt();
            }
            
        }
        System.out.println("Sum of numbes" + sum);
        sc.close();
    }
    
}