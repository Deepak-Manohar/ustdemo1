package com.company;
public class Model {

        private String BrandName;
        private String color;
        private int price;
        private double rating;

        public Model(String BrandName, String color, int price, double rating){
            this.BrandName = BrandName;
            this.color = color;
            this.price = price;
            this.rating = rating;
        }

        public String getBrandName(){
            return BrandName;
        }

        public String getColor(){
            return color;
        }

        public int getPrice(){
            return price;
        }

        public double getRating(){
            return rating;
        }

    }


