/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankingapplication3;

/**
 *
 * @author sirapob
 */
public class Bank {
    private String name;
    
    public Bank(String name){
        this.name = name;
    } 
    public void listAccount(){
        
    }
    public void openAccount(Account account){
        
    }
    public void closeAccount(int number){
        
    }
    public void depositMoney(Account account,double amount){
        account.deposit(amount);
    }
    public void withdrawMoney(Account account,double amount){
        account.withdraw(amount);
    }
    public Account getAccount(int number){
        String accName = "aaaa";
        double balance = 500;
        Account account  = new Account(number,accName,balance);
        return account;
    }
}
