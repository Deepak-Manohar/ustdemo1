package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;

public class  Streammovie {

    public static  void show(){

        List<movi> movies = List.of(
                new movi(10,4,"abc"),
                new movi(60,5,"dgc"),
                new movi(80,3,"hgj"),
                new movi(20,3,"kjg"),
                new movi(20,1,"kjhg"),
                new movi(40,2,"lku")
        );
        System.out.println("filter topic");
        movies.stream()

            .filter(m-> m.getLikes()>10)
             .peek(m-> System.out.println("filtered" + m.getLikes()))
               .forEach( m-> System.out.println(m.getName()));

               // .map(movi::getName)
               // .distinct()
                //.forEach( System.out::println);
                  // .forEach( n-> System.out.println(n));
                // ................................................
                //.sorted(Comparator.comparing(m-> m.getRating()))
                //.sorted(Comparator.comparing(movi::getRating))
                //.sorted(Comparator.comparing(movi::getRating).reversed())
               // .forEach(m-> System.out.println(m.getRating()));

                //.filter(n -> n.getLikes()>5)
                //.forEach(n -> System.out.println(n.getRating()));

       //.map(movi::getName)
         //.peek(t-> System.out.println("mapped" + t))
         //.forEach( System.out::println);




    }
}
