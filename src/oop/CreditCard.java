package oop;

public class CreditCard {
    String accountNumber; // номер счета
    int balance; // текущая сумма на счету (баланс счета)
    int newBalance;

    public CreditCard(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int topUpCard (int balance, int refill) {// метод пополнения карты. Текущий баланс + сумма пополнения
        return newBalance = balance + refill;
    }

    public int withDrawFromCard (int balance, int spending) {// метод снятия с карты.
        return newBalance = balance - spending;
    }

    public void showBalance () { // метод вывода текщей информации о карте
        System.out.println("Баланс вашей карты " + accountNumber + " равен " + newBalance);
    }

}
