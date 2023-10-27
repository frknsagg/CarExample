package org.example.Payment;

import org.example.entities.Car;

public class CryptoPayment implements Payment{
    @Override
    public boolean purchase(double price) {
        return true;
    }
}
