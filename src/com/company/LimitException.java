package com.company;
/*
Написать класс проверяемого исключения LimitException, с конструктором LimitException(String message,
double remainingAmount) и методом getRemainingAmount().
*/
public class LimitException extends Exception{
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

    double getRemainingAmount(){

        return remainingAmount;
    }
}
