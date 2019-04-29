package com.example.demo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        int[] input = {10,6,2};
        GCD gcd = new GCD();
        System.out.println(gcd.execute(input));
    }
}
