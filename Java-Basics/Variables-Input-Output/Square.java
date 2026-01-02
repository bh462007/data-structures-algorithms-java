
import java.util.Scanner;


class Square{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the side: ");
        float side=sc.nextFloat();

        System.out.println("Area: "+side*side);
        System.out.println("Perimeter: "+4*side);
        System.out.println();

    }
}