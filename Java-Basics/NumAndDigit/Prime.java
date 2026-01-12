
import java.util.Scanner;

class Prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not Prime");
        }

        boolean flag = false;
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                flag=true;
                break;
            }
        }
        
        if(flag){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
        
    }
}