import java.util.Scanner;
class CountDigits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the digit: ");
        int num=sc.nextInt();
        if (num==0) {
            System.out.println(1);
            return;
        }
        int count=0;
        while (num>0) { 
            num=num/10;
            count++;
        }
        System.out.println("The count of digits: "+count);
    }
}