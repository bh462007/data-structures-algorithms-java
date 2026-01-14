
import java.util.Scanner;

class ReverseArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total array size:");
        int total=sc.nextInt();
        int[] arr=new int[total];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int start=0;
        int end=arr.length-1;
        while(start <= end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("Reversed array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}