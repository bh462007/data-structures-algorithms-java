
import java.util.Scanner;

class SumArray{
    public static void main(String[] args) {

        int[] num = {2, 4, 6, 8};
        int s=0;
        for (int i = 0; i < num.length; i++) {
            s=s+num[i];
        }
        System.out.println("Sum:"+s);

        //taking all the elements from array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println("Sum:"+sum);


    }
}