public class COUNTOFDIGITS2 {
    public static void main(String[] args) {
        long arr[] = {9032011136L,9985111136L,7995498320L,9391222575L,9908827309L,9985123456L};
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
            if(evencount==oddcount){
                System.out.println("Neutral Number");
            }else if( evencount>oddcount){
                System.out.println("Even Biased Number");
            }else{
                System.out.println("Odd Biased Number");
            }
    
           // 5 odd 5 even - Neutral Number
           // 6 odd 4 even - Odd Biased Number
           // 4 odd 6 even - Even Biased Number
        }
    }
}
