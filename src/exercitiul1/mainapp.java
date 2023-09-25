package exercitiul1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class mainapp {
    public static void main(String[] args) {

        System.out.println("Primul program");

        Scanner scanner=new Scanner(System.in);
        System.out.println("a=");
        int a=scanner.nextInt();
        System.out.println("Ati introdus val "+a);
        scanner.close();

        String nume_fis="in_txt";

        BufferedReader flux_in = new BufferedReader(new InputStreamReader(System.in));


    }
}
