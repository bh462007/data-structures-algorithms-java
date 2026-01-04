import java.util.Scanner;
class SumOfDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        while (num>0) { 
            int n=num%10;
            sum=sum+n;
            num/=10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}