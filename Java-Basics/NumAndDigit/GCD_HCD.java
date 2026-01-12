
import java.util.Scanner;

class GCD_HCD{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int a=Math.min(n2, n2);
        int gcd=1;
        for (int i = 1; i <= a; i++) {
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);

        
    }
}