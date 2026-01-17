
import java.util.Scanner;

class IsUpperOr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        int counter1=0;
        int counter2=0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch)){
                counter1++;
            }
            else{
                counter2++;
            }
        }
        System.out.println("Total upper case characters: "+counter1);
        System.out.println("Total lower case characters: "+counter2);
    }
}