
import java.util.Scanner;

class MaxEle{
    public static void main(String[] args) {

        int[] array = {5, 12, 3, 19, 7};
        int maximum=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>maximum){
                maximum=array[i];
            }
        }
        System.out.println("Max Element:"+maximum);

        //taking all the elements from array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total of array:");
        int total=sc.nextInt();
        int[] arr=new int[total];
        System.out.println("Enter the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element:"+max);
    }
}