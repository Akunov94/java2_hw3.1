package com.company;

/*
b)  Написать класс BankAccount с 1 полем double amount - остаток на счете и методами getAmount() - возвращает текущий
остаток на счете, deposit(double sum) - положить деньги на счет, withDraw(int sum) - снимает указанную сумму со счета.
c)  Также метод withDraw() может сгенерировать исключение в том случае если запрашиваемая сумма на снятие больше чем
остаток денег на счете.
*/
public class BankAccount extends Exception {
    double amount;

    public BankAccount() {
        amount = 0;
    }

    double getAmount() {
        return amount;
    }

    void deposit(double sum) {
        amount += sum;
    }

    void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Запрашиваемая сумма больше чем остаток", sum);
        }
        amount -= sum;
        System.out.println("Снимаем со счета " + sum);

    }
}
