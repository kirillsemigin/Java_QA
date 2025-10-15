package oop;

public class CreditCard {
    String accountNumber; // номер счета
    int balance; // текущая сумма на счету (баланс счета)

    public CreditCard(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void topUpCard (int amount) {// метод пополнения карты. Текущий баланс + сумма пополнения
        balance += amount;
        System.out.println("Сумма " + amount + " успешно зачислена на карту " + accountNumber);
    }

    public void withDrawFromCard (int amount) {// метод снятия с карты.
        balance += amount;
        System.out.println("Сумма " + amount + " успешно снята с карты " + accountNumber);
    }

    public void showBalance () { // метод вывода текщей информации о карте
        System.out.println("Карта №: " + accountNumber);
        System.out.println("Баланс вашей карты : " + balance);
        System.out.println("_____________________________________________________________");
    }
}
