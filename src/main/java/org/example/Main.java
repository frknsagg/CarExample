package org.example;

import org.example.Payment.CreditCardPayment;
import org.example.Payment.Payment;
import org.example.business.CarManager;
import org.example.core.DatabaseLogger;
import org.example.core.FileLogger;
import org.example.core.Logger;
import org.example.core.MailLogger;
import org.example.dataAccess.HibernateProductDao;
import org.example.dataAccess.JdbcProductDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception{
        Car car1 = new Car(1,"Opel Vectra",2006,"Opel",1500000,5,true);
        Logger[] loggers = {new DatabaseLogger()};
        Payment payment = new CreditCardPayment();
        CarManager carManager = new CarManager(new HibernateProductDao(),loggers,payment);

        carManager.add(car1);
        carManager.purchaseCar(car1,payment);
        System.out.println("Aracın yeni stok sayısı : " + car1.getUnitInStock());
    }
}