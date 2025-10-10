package oop;

public class Task1 {
    public static void main(String[] args) {

        CreditCard creditCard1 = new CreditCard("40802810912345678901", 500000);
        CreditCard creditCard2 = new CreditCard("42202978433716163218", 100);
        CreditCard creditCard3 = new CreditCard("42103810130996329653", 1000);
        /*
        Действия с картами
         */
        creditCard1.topUpCard(creditCard1.balance, 500); // пополняем карту 1
        creditCard2.topUpCard(creditCard2.balance, 300); // пополняем карту 2
        creditCard3.withDrawFromCard(creditCard3.balance, 200); // снимаем с карты 3
        /*
        Выводим на экран текущее состояние всех трех карточек
         */
        creditCard1.showBalance();
        creditCard2.showBalance();
        creditCard3.showBalance();
    }
}
