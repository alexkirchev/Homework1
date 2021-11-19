package my.homework;

import java.util.Scanner;

public class MyHomework1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("User's name?");
        String name = scanner.nextLine();

        System.out.println("User's hobby?");
        String hobby = scanner.nextLine();

        System.out.println("The name of the user is " + name);
        System.out.println("User's hobby is "+ hobby);
    }
}
