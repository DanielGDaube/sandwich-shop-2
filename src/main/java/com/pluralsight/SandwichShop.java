package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner sandwichInput = new Scanner(System.in);
        double price = 0;

        // Ask user what size they want
        System.out.println("What size do you want? Press 1 for regular or 2 for large.");
        int size = sandwichInput.nextInt();

        if(size == 1){
            price = 5.45;
        }
        else if(size == 2){
            price = 8.95;
        }
        else{
            System.out.println("Error, please pick a valid size.");
        }

        // Ask user for their age then calculate and apply discount
        System.out.println("What is your age?");
        int age = sandwichInput.nextInt();

        double discount = (age <= 17)? price * .1:
                (age >= 65)? price * .2:
                        0;
        double totalPrice = price - discount;

        // Display total price
        System.out.printf("$%.2f", totalPrice);
    }
}
