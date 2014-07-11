package com.andrewcamero.abstracts;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println();
        
        Animal tiger = new Tiger();
        tiger.getName();
        tiger.makeSound();
        System.out.println();
        
        Animal wolf = new Wolf();
        wolf.getName();
        wolf.makeSound();
    }
}
