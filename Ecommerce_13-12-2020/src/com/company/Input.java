package com.company;
import java.util.Scanner;

public  class Input {

        static Scanner sc = new Scanner(System.in);
        public static void select(){
            System.out.println("Category : 1.Mobiles  2.clothes");
            String category = sc.nextLine().toLowerCase();

            if(category.equals("mobiles")) {
                new Examinationpage().mobile();
            }

            else if(category.equals("clothes")){
                new Examinationpage().clothes();
            }
            else
                System.out.println("Sorry, Not found");


        }
    }

