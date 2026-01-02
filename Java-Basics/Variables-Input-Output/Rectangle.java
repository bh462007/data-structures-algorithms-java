
import java.util.Scanner;


class Rectangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length:");
        float length=sc.nextFloat();
        System.out.print("Enter the breadth:");
        float breadth=sc.nextFloat();

        System.out.println("Area: "+length*breadth);
        System.out.println("Perimeter: "+2*(length+breadth));
        System.out.println("");

    }
}