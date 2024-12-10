package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Black", 2011), new Car("Green", 1998), new Car("Red", 2019));

    public static void main(String[] args) {
        System.out.println(filterRedCar(cars));
        System.out.println(filterGreenCar(cars));
        System.out.println(filterCarByColor(cars, "Black"));
        System.out.println(filterCarByColor(cars, "Red"));
        System.out.println(filterByYear(cars, 2018));

    }

    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> carList = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals("Red")) {
                carList.add(car);
            }
        }
        return carList;
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> carList = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals("Green")) {
                carList.add(car);
            }
        }
        return carList;
    }

    private static List<Car> filterCarByColor(List<Car> cars, String color) {
        List<Car> carList = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                carList.add(car);
            }
        }
        return carList;
    }
    private static List<Car> filterByYear(List<Car> cars, int year) {
        List<Car> carList = new ArrayList<>();

        for (Car car : cars) {
            if (car.getYear() < year) {
                carList.add(car);
            }
        }
        return carList;
    }


}
