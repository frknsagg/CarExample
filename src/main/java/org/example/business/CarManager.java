package org.example.business;

import org.example.Payment.Payment;
import org.example.core.Logger;
import org.example.dataAccess.CarDao;
import org.example.entities.Car;

public class CarManager {
    private CarDao carDao;
    private Logger[] loggers;
    private Payment payment;


    public CarManager(CarDao carDao, Logger[] loggers, Payment payment) {
        this.carDao = carDao;
        this.loggers=loggers;
        this.payment=payment;
    }

    public void add(Car car) throws Exception{
        if (car.getModel()<2005)
        {
            throw new Exception("Arabanız çok eski");
        }
        carDao.add(car);
        for (Logger logger: loggers){
            logger.log(car.getName());
        }
    }
    public void purchaseCar(Car car,Payment payment) throws Exception{
        if (!car.getIsInStock()){
            throw new Exception(car.getId() +" plakalı araç stokta yok");
        }
       if (payment.purchase(car.getUnitPrice())){
            System.out.println(car.getName() + " " + car.getUnitPrice() + "'a satılmıştır.");
            car.setUnitInStock(car.getUnitInStock() - 1);
       }
       else{
           System.out.println("Ödeme işlemi yapılamadı");
       }

    }
}
