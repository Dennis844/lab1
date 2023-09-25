package exercitiul1;

import java.util.Scanner;

public class tema1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti valorile:");
        System.out.println("a=");
        int a=scanner.nextInt();
        System.out.println("b=");
        int b=scanner.nextInt();
        int Aria=a*b;
        System.out.println("Aria este: "+Aria);

    }
}
