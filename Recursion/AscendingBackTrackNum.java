
import java.util.Scanner;

class AscendingBackTrackNum{
    public static void f(int i,int n){
        if(i<1)
            return;
        f(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        f(n,n);
    }
}