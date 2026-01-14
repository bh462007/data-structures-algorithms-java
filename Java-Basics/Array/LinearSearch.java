
import java.util.Scanner;

class LinearSearch{

    //taking input from user
    static int linear(int[] arr, int target){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    return i;
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total of array:");
        int total=sc.nextInt();
        int[] arr=new int[total];
        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target:");
        int target=sc.nextInt();
        int result=linear(arr,target);
        if(result!=-1){
            System.out.println("Found ar index "+result);
        }
        else{
            System.out.println("Not found");
        }



        //only taking the target element
        int[] array = {3, 7, 15, 9, 2};
        System.out.println("Enter the target:");
        int key=sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==key){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
}