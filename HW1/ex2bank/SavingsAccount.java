package semester2.lab1.HW1.ex2bank;
// Assignment: 1
// Author: Michael Kupfer, ID: 209493246

/**
 * class about saving account in the bank
 */
public class SavingsAccount {
    /**
     * the annual intrest rate - beteen -1 to 1 present.
     */
    private static double annualInterestRate;
    /**
     * the account number index.
     */
    private int accountCounter=1000;
    /**
     * the final account number of each account.
     */
    private final int accountNumber;
    /**
     * the client from class personld. name and id.
     */
    private Personld client;
    /**
     * how much money the account have.
     */
    private double savingsBalance;

    /**
     * the main builder of the class saving account. gets a final index from a static index.
     * @param client the details of the client. name and id.
     * @param savingsBalance how much money is in the account.
     */
    public SavingsAccount(Personld client, double savingsBalance){
        accountNumber=accountCounter;
        accountCounter++;
        this.savingsBalance=savingsBalance;
        this.client=client;
    }

    /**
     * builder of saving account with only client details.
     * @param client details of the client.Personld.
     */
    public SavingsAccount(Personld client){
        accountNumber=accountCounter;
        accountCounter++;
        this.client=client;
        this.savingsBalance=0;
    }

    /**
     * calculate and add the rate each month.
     */
    public void calculateMonthlyInterest(){
        savingsBalance+=savingsBalance*annualInterestRate/12;
    }

    /**
     * modify the interest rate
     * @param rate the new rate user want to update.
     */
    public static void modifyInterestRate(double rate){
        annualInterestRate=rate;
    }

    /**
     * return the account details.
     * @return return the account details.
     */
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "accountCounter=" + accountCounter +
                ", accountNumber=" + accountNumber +
                ", client=" + client +
                ", savingsBalance=" + savingsBalance +
                '}';
    }

    /**
     * check if 2 accounts are the same
     * @param o other account user want to check
     * @return true if they are the same and false if not.
     */
    @Override
    public boolean equals(Object o) {
        SavingsAccount that = (SavingsAccount) o;
        return accountNumber == that.accountNumber;
    }
}
