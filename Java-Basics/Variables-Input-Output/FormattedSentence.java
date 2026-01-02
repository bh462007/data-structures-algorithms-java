
import java.util.Scanner;

class FormattedSentence{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your education:");
        String edu=sc.nextLine();
        System.out.print("Enter your age:");
        int age=sc.nextInt();

        System.out.println("Hi, I am "+name+", "+age+" years old, a "+edu);
        System.out.println();
    }
}