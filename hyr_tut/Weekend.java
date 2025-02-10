package hyr_tut;
import java.util.*;

public class Weekend {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dayname");
        String dayName = sc.next();
        if(dayName == "Mon" ||dayName == "tue"||dayName == "wed"||dayName == "thurs"||dayName == "fri" ){
        System.out.println("Its not weekend");
        }else{
            System.out.println("Its a weekend");
        }
    }
}
    

