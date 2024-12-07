package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDemo {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        // Insert Vehicle
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Generic Vehicle");
        vehicle.setType("Utility");
        vehicle.setMaxSpeed(100);
        vehicle.setColor("White");
        session.save(vehicle);

        // Insert Car
        Car car = new Car();
        car.setName("Sedan");
        car.setType("Car");
        car.setMaxSpeed(180);
        car.setColor("Red");
        car.setNumberOfDoors(4);
        session.save(car);

        // Insert Truck
        Truck truck = new Truck();
        truck.setName("Cargo Truck");
        truck.setType("Truck");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(10000);
        session.save(truck);

        transaction.commit();
        session.close();

        System.out.println("Records inserted successfully!");
    }
}
