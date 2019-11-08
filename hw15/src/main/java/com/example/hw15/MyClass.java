package com.example.hw15;

public class MyClass {
    public static void main(String[] argv) {
        java.util.Scanner scanner = new
                java.util.Scanner(System.in);
        System.out.println("現在小時:");
        int h = scanner.nextInt();
        System.out.println("現在分鐘:");
        int m = scanner.nextInt();

        if ((h >= 7 && m >= 30) )
        {
            System.out.println("目前在學校");
        }
        else
        {
            System.out.println("目前不在學校");
        }
    }
}
