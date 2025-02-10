package hyr_tut ;
import java.util.*;

public class Marks {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks = sc.nextInt();
        if(marks>85){
             System.out.println("1st class");
        } else if( marks>70 && marks<=85){
            System.out.println("2nd class");
        } else if( marks>35 && marks<=70){
            System.out.println("3rd class");
        } else if( marks==35){
            System.out.println("pass");
        } else{
            System.out.println("fail");
        }
        sc.close();
 
    }

    
}
