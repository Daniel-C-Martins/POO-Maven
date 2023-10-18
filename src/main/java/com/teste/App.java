package com.teste;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Conjuntos!" );
        Set<Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(null);
        System.out.println(s1);
        System.out.println("O conjunto s1 contém o número 1? ");
        System.out.println(s1.contains(1));
        System.out.println("O conjunto s1 contém o número 6? ");
        System.out.println(s1.contains(6));

        Set<Integer> empty = new HashSet<>();
        empty.add(2);
        empty.add(null);
        System.out.println("O conjunto s1 contém o conjunto vazio? ");
        System.out.println(s1.containsAll(empty));
    }
}
