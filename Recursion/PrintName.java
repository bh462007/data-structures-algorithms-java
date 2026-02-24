
import java.util.Scanner;

class PrintName{

    static void f(int i,int n){
        if(i>n)
            return;
        System.out.println(i+" Sam");
        f(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        f(1,n);

    }
}