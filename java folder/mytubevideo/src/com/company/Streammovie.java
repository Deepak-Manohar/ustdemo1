package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class  Streammovie {

    public static  void show(){

        List<movi> movies = List.of(
                new movi(10,4,"aarambam"),
                new movi(60,5,"theri"),
                new movi(80,3,"jilla"),
                new movi(20,3,"mersal"),
                new movi(20,1,"master"),
                new movi(40,2,"valimai")
        );
      //  System.out.println("||  filter topic  ||");
       // movies.stream()
           // .filter(m-> m.getLikes()>10)
           //  .peek(m-> System.out.println("filtered" + m.getLikes()))
            //   .forEach( m-> System.out.println(m.getName()));
//..........................................................................
       // var result = movies.stream()
            //   .allMatch(m -> m.getLikes() < 20);
             //   System.out.println(result);
//..................................................
        Predicate<movi> isPopular = m -> m.getLikes() > 20;
       movies.stream()
               .filter(isPopular)


                .forEach(n-> System.out.println( n.getName()));
         //  ......................................................................
        movies.stream()

           .dropWhile( n-> n.getLikes()<20)
             .forEach(n-> System.out.println(n.getName()));


        // ................................................
             movies.stream()
                .sorted(Comparator.comparing(m-> m.getRating()))
                .sorted(Comparator.comparing(movi::getRating))
                .sorted(Comparator.comparing(movi::getRating).reversed())
                .forEach(m-> System.out.println(m.getRating()));





    }
}
