
import java.util.Scanner;
class SumNum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1= sc.nextInt();
        //System.out.println();
        System.out.print("Enter second number:");
        int num2= sc.nextInt();

        System.out.println("Sum: "+(num1+num2));
        System.out.println("Difference: "+(num1-num2));
        System.out.println("Product: "+(num1*num2));
        System.out.println("Quotient: "+(num1/num2));
        System.out.println();
    }
}