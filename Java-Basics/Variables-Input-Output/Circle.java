
import java.util.Scanner;


class Circle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the radius:");
        float radius=sc.nextFloat();
        
        System.out.println("Radius:"+Math.PI*radius*radius);
        System.out.println("circumstances:"+2*Math.PI*radius);
        System.out.println();
    }
}