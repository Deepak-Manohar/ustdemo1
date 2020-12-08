package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
         MyCart Mycart= new MyCart();
        Mycart.apple= 600;
        Mycart.mangoes =700;
        int cart= (int)Mycart.cartdetails(800);
        System.out.println(cart);
    }
}
