import java.util.ArrayList;
import java.util.Arrays;

public class SUMOFARRAYS {
    public static void main(String[] args) {
        

        // This is the method which I had done

        /*
        int[] a = {10,20,40,100,150};
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i] + a[j] == 120){
                    System.out.println("The indexes are: "+ i+" "+ j);

                }else{
                    System.out.println("NOT FOUND");
                }
            }
        }
            */

            //This is the method which sir has thought

           /* int[] a = {10,20,40,100,150};
            int sum = 120;
            int flag =0;
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    if( a[i] + a[j]==sum && a[i]<a[j] ){

                        // in this condition here we use nested for loop
                         // so the time complexity is O(n square) i.e 
                         //Qudratic Time complexity
                         //

                        System.out.println("["+a[i]+","+a[j]+"]");
                        flag=1;
                        break;
                    }
                }
            }
            if (flag==0){
                System.out.println("Value not found");
            }
             */




          // TIME COMPLEXITY

          /* T(n) = O(n) -  Linear Time complexity
            T(n) =  O(n square) - Quadratic time complexity
            O(n square ) > O(n)
            */



            // LET US SEE WHETHER WE CAN USE SINGLE FOR LOOP FOR 
            // ADDING TWO INDEXES IN THE ARRAY
            // TO USE WE NEED TO KNOW 
            // -----COLLECTION FRAMEWORK IN JAVA----

            ArrayList<Integer> arr = new ArrayList(Arrays.asList(10,20,40,100,150));
            int sum=160;
            int flag=0;
            for(int i=0;i<arr.size();i++){
                int num1 = arr.get(i);
                int num2 = sum-num1;
                if(arr.contains(num2)){
                    System.out.println("["+num1+","+num2+"]");
                    flag=1;
                    break;
                }
                if(flag ==0){
                    System.out.println("Pair not found");
                }
            }


    }
}