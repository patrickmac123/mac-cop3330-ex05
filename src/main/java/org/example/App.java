package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 5 Solution
 *  Copyright 2021 Patrick Mac
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print( "What is the first number? " );
        String x = scan.nextLine();
        System.out.print( "What is the second number? " );
        String y = scan.nextLine();

        int x1=Integer.parseInt(x);
        int y1=Integer.parseInt(y);

        int add = x1 + y1;
        int sub = x1 - y1;
        int mult = x1 * y1;
        int div = x1 / y1;

        System.out.println(x1+" + "+y1+" = "+add+ "\r\n" +x1+" - "+y1+" = "+sub+ "\r\n" +x1+" * "+y1+" = "+mult+ "\r\n" +x1+" / "+y1+" = "+div);
    }
}