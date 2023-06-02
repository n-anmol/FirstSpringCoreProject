package com.cg.spring.assigments_31_bankTransaction;

public class BankTransaction {
    public String performTransaction(String accountNumber, double transactionAmount)
            throws IllegalArgumentException, StringIndexOutOfBoundsException{
        if(accountNumber.length()!=4){
            throw new NumberFormatException("Invalid account number.");
        }
        if(transactionAmount<=0){
            throw new IllegalArgumentException("Invalid transaction amount.");
        }
        if(accountNumber.charAt(0)!='9'){
            try{
                System.out.println(accountNumber.charAt(5));
            }catch(IndexOutOfBoundsException ex){
                throw new StringIndexOutOfBoundsException("Account number should start with 9.");
            }
        }
        return "Transaction completed.";
    }
}
