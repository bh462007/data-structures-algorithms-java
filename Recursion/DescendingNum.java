
import java.util.Scanner;

class DescendingNum{
    public static void f(int i,int n){
        if(i < 1)
            return;
        System.out.println(i);
        f(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        f(n,n);
    }
}