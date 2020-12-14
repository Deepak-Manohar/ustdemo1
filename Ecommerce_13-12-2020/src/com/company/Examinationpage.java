package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Examinationpage<result> {
    List<Model> mobile = List.of(new Model("Redmi", "orange", 7499, 4.4),
            (new Model("poco", "grey", 8999, 4.3)),
            (new Model("samsung", "black", 19999, 4.5)),
            (new Model("Apple", "voilet", 10999, 4.2))
    );

    List<Model> clothes = List.of(new Model("allenSolly", "Red", 5990, 3.4),
            (new Model("U.S Polo", "Blue", 7990, 2.2)),
            (new Model("Benetton", "black", 990, 4.1)),
            (new Model("Peter England", "White", 8690, 3.2))
    );

    public void mobile(){

        Data.fulldata();
       // mobile.stream()
                //  .map(mob -> mob.getBrand())
                //.forEach(n -> System.out.println(n.getColor() +", "+ n.getPrice() +", "+ n.getRating()));
        var result = mobile.stream()
         .allMatch(m -> m.getRating()>4);
          System.out.println(result);

        Data.sortByPrice();
        mobile.stream()
                //.sorted(Comparator.comparing(m -> m.getPrice()))
               // .forEach(b -> System.out.println(b.getPrice() +", "+ b.getColor()));
                .dropWhile( n-> n.getPrice()<8000)
                .forEach(n-> System.out.println(n.getColor() +", "+ n.getPrice() +", "+ n.getRating()));

        Data.sortByRating();
        mobile.stream()
                //.sorted(Comparator.comparing(m -> m.getRating()))
                .sorted(Comparator.comparing(Model::getRating).reversed())
                .forEach(b -> System.out.println(b.getRating() +", "+ b.getColor()));

    }

    public void clothes(){
        Predicate<Model> isPopular = m -> m.getRating() > 4;

        Data.fulldata();
        clothes.stream()
                .forEach(n -> System.out.println(n.getColor() +", "+ n.getPrice() +", "+ n.getRating()));

        Data.sortByPrice();
        clothes.stream()
                //.sorted(Comparator.comparing(m -> m.getPrice()))
               // .forEach(b -> System.out.println(b.getPrice() +", "+ b.getBrand()));
                .filter(isPopular)


                .forEach(n-> System.out.println(n.getColor()));

        Data.sortByRating();
        clothes.stream().sorted(Comparator.comparing(m -> m.getRating()))
                .forEach(b -> System.out.println(b.getRating() +", "+ b.getColor()));

    }



}
