
import java.util.Scanner;

//reverse a string without using reverse()
class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String s=sc.nextLine();

        String rev="";
        // for (int i = s.length()-1; i >= 0; i--) {
        //     rev=rev+s.charAt(i);

        // }
        // System.out.println("REverse:"+rev);

        for (int i = s.length()-1; i >= 0; i--) {
            rev = rev + s.substring(i, i+1);
        }
        System.out.println("Reverse:"+rev);
        
    }
}