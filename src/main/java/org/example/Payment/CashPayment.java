package org.example.Payment;

import org.example.entities.Car;

public class CashPayment implements Payment{

    @Override
    public boolean purchase(double price) {
        return false;
    }
}
