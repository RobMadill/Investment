/*Name: Robert Madill
*Assignment: 5
*Program: Software Development and Network Engineering

[Explanation of program]
This program is designed to set a balance and interest rate. With these set we can calculate the total interest and total investment.
*/
public class Investment{
    private double balance;
    private double interestRate;
    //This is the constructor for the class and gives the default values for balance and interestRate.
    public Investment(){
        balance=1000;
        interestRate=3.5;
    }
    //This method will call two other methods (setBalance and setInterestRate). They will take the parameters to set the instance variables
    public Investment(double balance, double rate){
        setBalance(balance);
        setInterestRate(rate);
    }
    //This method is created if the other program needs to get the intretest rate
    public double getInterestRate(){
        return this.interestRate;
    }
    //this method is created if the other program needs to get the balance
    public double getBalance(){
        return this.balance;
    }
    //this method sets the balance from what other programs may need with the condition that it is greater than 0
    public void setBalance(double balance){
        if(balance<=0){
            throw new IllegalArgumentException("Error: Balance can't be less than 0");
        }else{
            this.balance=balance;
        }
    }
    //this method sets the interest rate from what other programs may need with the condition that it is greater than 0 and less than 12
    public void setInterestRate(double rate){
        if(rate<=0 || rate>12){
            throw new IllegalArgumentException("Error: Interest rate can't be less than 0 or greater than 12");
        } else{
             this.interestRate=rate;
        }
    }
    //this method is used to calculate the total interest rate
    public double totalInterest(){
        return (this.balance*this.interestRate)/100;
    }
    //this method is used to calculate the total investment 
    public double totalInvestment(int periods){
        return this.balance*(Math.pow(1+(this.interestRate/100),periods));   
    }
    //this method is used to send a string to the other program that will give out the current balance and interest rate
    public String toString(){
        return String.format("Investment Information%nCurrent Balance: $%,.2f%nInterest Rate: %.2f%%",this.balance, this.interestRate);
    }
}