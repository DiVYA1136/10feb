public class Swappingoftwonumberswithouttemp {
    public static void main(String[] args) {
        int a = 90;
        int b = 32;
        System.out.println("Before swapping the values are: "+a+","+b);
        a = a+b; // a=90+32=112
        b = a-b; // b=112-32=90
        a = a-b; // a=112-90 = 32
        System.out.println("After swapping the values are: "+a+","+b);
    }
    
}
