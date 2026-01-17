
import java.util.Scanner;

class NumOfConsonants{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.nextLine();
        s=s.toLowerCase();
        int counter=0;

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch!='a'&&ch!='e'&&ch!='i'&&ch!='o'&&ch!='u'){
                counter++;
            }
        }
        System.out.println("Count:"+counter);
    }
}