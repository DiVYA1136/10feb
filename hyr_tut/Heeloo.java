package hyr_tut;

import java.util.Scanner;


class Heeloo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("Input: "+number);
        if(number%2==0){
            System.out.println("EVEN NUMBER");
        }else{
            System.out.println("ODD NUMBER");
        }
        sc.close();

        
    }
}
