public class COUNTOFDIGITS {
    public static void main(String[] args) {
        int arr[] = {1234,34,87513,345,1};
        int counter;

        // using for each loop 
        /* 
        for(int n:arr){
            counter=0;
            while(n>0){
                counter++;
                n/=10;
            }
            System.out.println(counter);
        }
            */

            //using for loop

            for(int i=0;i<arr.length;i++){
                int n=arr[i];
                counter=0;
                while(n>0){
                    counter++;
                    n/=10;
                }
                System.out.println("number "+(i+1)+ " has " + counter +" digits"  );

            }
    }
    
}
