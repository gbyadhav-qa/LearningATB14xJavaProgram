package Javacodeingprograms;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Inputuser {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String name=sc.nextLine();
        System.out.println("enter your age");
        int age= sc.nextInt();
        System.out.println("my name is "+ name +" "+ "my age is:" +  age);

    }
}
