import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
         int a[] = {99,85,11,11,36};
        System.out.println("Before : " +Arrays.toString(a));
        insertionsort(a);
        System.out.println("After : "+Arrays.toString(a));

    }
    public static void insertionsort(int[] a){
       
        for(int i=1;i<a.length;i++){
            //int a[] = {99,85,11,11,36}; 
            int temp = a[i]; // temp = a[1] = 85
            int j=i-1;  //j=1-1=0
            while(j>=0 && a[j] < temp){  //j=0 && 99>85 // descending order
                a[j+1]= a[j]; //a[1] = 99
                j--; 
            }
            a[j+1] = temp;
            
        }
    }
    
}
