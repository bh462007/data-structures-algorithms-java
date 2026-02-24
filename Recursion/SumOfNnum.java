
import java.util.Scanner;

class SumOfNnum{

    static int f(int i, int sum){
        if(i<1)
        {
            System.out.println(sum);
            return sum;
        }
        return f(i-1,sum+i);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        f(n,sum);
    }
}