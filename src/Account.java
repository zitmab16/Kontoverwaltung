/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vizug
 */
public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int value){
        balance-=value;
    }
    public synchronized void deposit(int value){
        balance+=value;
    }

    public int getBalance() {
        return balance;
    }
    
}
