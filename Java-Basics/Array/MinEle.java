
import java.util.Scanner;

class MinEle{
    public static void main(String[] args) {

        int[] array = {8, 4, 6, 2, 9};
        int minimum=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<minimum){
                minimum=array[i];
            }
        }
        System.out.println("Min Element:"+minimum);

        //taking all the elements from array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total array elements:");
        int total=sc.nextInt();
        int[] arr=new int[total];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum Element:"+min);
    }
}