public class COUNTOFDIGITS2 {
    public static void main(String[] args) {
        long arr[] = {9032011136L,9985111136L,7995498320L,9391222575L};
        for (int i = 0; i < arr.length; i++) {
            long n=arr[i];
            int oddcount=0,evencount=0,r;
            while(n>0){
            
                r=(int) n%10;
                if(r%2==0){
                evencount++;
                
                }else{
                    oddcount++;


                }
                n/=10;
            }
            System.out.println(String.format("Mobile Number %d has %d odd digits and %d even digits ",(i+1),oddcount,evencount));
    
           
        }
    }
}
