package com.company;

import java.util.Arrays;

/*
d)  Написать Main класс где бы создавался счет клиента. Положить 10 000 сом на счет.
e)  Затем попытаться снять через бесконечный цикл, каждую итерацию по 6000 сом, при этом отлавливать исключение
LimitException и при возникновении такого исключения снимать только ту сумму которая осталась на счете и завершать
бесконечный цикл
*/
public class Main {

    public static void main(String[] args) throws LimitException {

        BankAccount account = new BankAccount();
        account.deposit(10000.0d);
        while (true) {
            try {
                account.withDraw(6000);
            } catch (LimitException e){
                System.out.println("Счет "+account.getAmount());
                account.withDraw((int) account.getAmount());
                System.out.println(e.getMessage());
                System.out.println("Счет "+account.getAmount());
                throw new LimitException("Остаток на счете", account.getAmount());
            }
        }
    }
}




