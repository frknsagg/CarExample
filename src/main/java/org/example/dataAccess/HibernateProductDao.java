package org.example.dataAccess;

import org.example.entities.Car;

public class HibernateProductDao implements CarDao{
    @Override
    public void add(Car car) {
        System.out.println(car.getName() + " eklendi");
    }

    @Override
    public void delete(Car car) {
        System.out.println(car.getName() + " silindi");
    }

    @Override
    public void update(Car car) {
        System.out.println(car.getName() + " güncellendi");
    }
}
