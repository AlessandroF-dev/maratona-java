package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("green", 2011), new Car("black", 1998), new Car("red", 2019));

    public static void main(String[] args) {
        System.out.println(filterCarByCollor(cars, "green"));
        System.out.println(filterCarByCollor(cars, "red"));
        System.out.println(filterGreenCar(cars));
        System.out.println(filterByYearBefore(cars, 2015));
    }
    private static List<Car> filterCarByCollor(List<Car> cars, String color) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> filterGreenCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filterGreenCar.add(car);
            }
        }
        return filterGreenCar;
    }


    private static List<Car> filterByYearBefore(List<Car> cars, int year) {
        List<Car> filterCar = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear() < year) {
                filterCar.add(car);
            }
        }
        return filterCar;
    }


}
