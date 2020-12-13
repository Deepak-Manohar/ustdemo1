package com.company;

public class movi implements Comparable<movi> {
    private int likes;
    private int rating;
    private String name;


   public  movi(int likes,int rating,String name){
       this.likes=likes;
       this.rating=rating;
       this.name=name;
   }
   public int getLikes() {
        return likes;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(movi o) {
        return 0;
    }
}


