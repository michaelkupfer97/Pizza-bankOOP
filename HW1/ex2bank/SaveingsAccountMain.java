package semester2.lab1.HW1.ex2bank;
// Assignment: 1
// Author: Michael Kupfer, ID: 209493246

import java.util.Arrays;


/**
 * main of Saving account in the bank
 * activate the methods in SavingAccount class and in personld methods.
 */
public class SaveingsAccountMain {
    public static void main(String[] args) {
/**
 * create a clients array and print it.
 */
        Personld[] clients = new Personld [10];
        clients[0] = new Personld(5000,"Bill","Gates","Tel-Aviv");
        clients[1] = new Personld(6000,"Mark","Zuckerberg","Jerusalem");
        clients[2] = new Personld(7000,"Steve","Jobs","Beer-Sheva");
        System.out.println(Arrays.toString(clients));
        System.out.println("=========================");
        /**
         * create account array and put in it the 3 client from earlier and put money in their bank account.
         */
        SavingsAccount[] accounts= new SavingsAccount[10];
        accounts[0]=new SavingsAccount(clients[0],2000);
        accounts[1]=new SavingsAccount(clients[1],3000);
        accounts[2]=new SavingsAccount(clients[2],4000);
        /**
         * modify the intrest rate in each account and calculate the interst per one month and print it.
         */
        SavingsAccount.modifyInterestRate(0.01);
        accounts[0].calculateMonthlyInterest();
        accounts[1].calculateMonthlyInterest();
        accounts[2].calculateMonthlyInterest();
        accounts[0].calculateMonthlyInterest();
        accounts[1].calculateMonthlyInterest();
        accounts[2].calculateMonthlyInterest();
        System.out.println(Arrays.toString(accounts));
        System.out.println("=========================");
        /**
         * calculate and print another time.
         */
        accounts[0].calculateMonthlyInterest();
        accounts[1].calculateMonthlyInterest();
        accounts[2].calculateMonthlyInterest();
        System.out.println(Arrays.toString(accounts));
        System.out.println("=========================");
        /**
         * modify new intrest rate, calculate the balance after one month and print it.
         */
        SavingsAccount.modifyInterestRate(-0.015);
        accounts[0].calculateMonthlyInterest();
        accounts[1].calculateMonthlyInterest();
        accounts[2].calculateMonthlyInterest();
        System.out.println(Arrays.toString(accounts));
        System.out.println("=========================");
    }



}
