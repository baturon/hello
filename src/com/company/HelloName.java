package com.company;

import java.util.Scanner;

public class HelloName{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in
        );
        System.out.println("Enter you name: ");
        String name;
        name = scanner.nextLine();
        System.out.print("Hello ");
        System.out.println(name);
    }

    }
