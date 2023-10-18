package com.teste;
import java.util.*;
import java.awt.Point;

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
        // 1 ∈ {1,2,3}
        System.out.println(s1);
        System.out.println("O conjunto s1 contém o número 1? ");
        System.out.println(s1.contains(1));
        System.out.println("O conjunto s1 contém o número 6? ");
        System.out.println(s1.contains(6));

        //∅ ⊂ {1,2,3}
        Set<Integer> empty = new HashSet<>();
        empty.add(2);
        empty.add(null);
        System.out.println("O conjunto s1 contém o conjunto vazio? ");
        System.out.println(s1.containsAll(empty));

        //{1,2} ⊆ {1,2,3,4}
        Set<Integer> s2 = new HashSet<>();
        s2.add(1);
        s2.add(2);
        Set<Integer> s3 = new HashSet<>();
        s3.add(1);
        s3.add(2);
        s3.add(3);
        s3.add(4);
        System.out.println("S2 está estritamente contido em S3? ");
        Set<Integer> diff = new HashSet<>(s3);
        diff.removeAll(s2);
        System.out.println(s3.containsAll(s2) && !diff.isEmpty());

        //  {1,2,3,4} − {1,2,5} = {3,4} --> "diferença entre conjuntos"
        Set<Integer> s4 = new HashSet<>(s3);
        Set<Integer> s5 = new HashSet<>();
        s5.add(1);
        s5.add(2);
        s5.add(5);
        s4.removeAll(s5);
        System.out.println("Qual a diferença entre s4 e s5? ");
        System.out.println(s4);

        //{1,2} × {3,4} = {(1,3), (1,4), (2,3), (2,4) --> "Produto cartesiano"
        Set<Point> pontos = new HashSet<>();
        for(Integer a : s2){
            for(Integer b : s4){
                Point p = new Point(a, b);
                pontos.add(p);
            }
        }
        System.out.println(pontos);

        
    }
}

