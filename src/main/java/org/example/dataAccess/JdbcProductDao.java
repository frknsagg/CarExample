package org.example.dataAccess;

import org.example.entities.Car;

public class JdbcProductDao implements CarDao{
    @Override
    public void add(Car car) {
        System.out.println("Jdbc ile veritabanına " + car.getName() + " eklendi");
    }

    @Override
    public void delete(Car car) {
        System.out.println("Jdbc ile veritabanına " + car.getName() + " silindi");
    }

    @Override
    public void update(Car car) {
        System.out.println("Jdbc ile veritabanına " + car.getName() + " güncellendi");
    }
}
