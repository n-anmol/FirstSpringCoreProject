package com.cg.spring.assigments_31_bankTransaction;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String accNo = "";
        double transAmount = 0.0d;

        System.out.print("Enter Account Number: ");
        accNo = read.next();
        System.out.print("Enter transaction amount: ");
        transAmount = read.nextDouble();

        BankTransaction bt = new BankTransaction();
        try{
            System.out.println(bt.performTransaction(accNo, transAmount));
        }catch(IllegalArgumentException | StringIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
        }finally {
            System.out.println("Thanks for using this application");
        }
    }
}
