package com.rafal.onlineshopspring.CarTest;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList;

    public CarService() {
        Car car1 = new Car("BMW", "i8");
        Car car2 = new Car("Fiat", "126p");
        Car car3 = new Car("Polonez", "Caro");
        carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
    }


    public List<Car> getCars() {
//        carList.forEach(System.out::println);
        return carList;
    }


    // unused in Spring App
//    public static void main(String[] args) {
//        CarService carService = new CarService();
//        carService.showCar();
//    }
}
