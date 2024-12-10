package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("Black", 2011), new Car("Green", 1998), new Car("Red", 2019));

    public static void main(String[] args) {

//        List<Car> greenCars = filter(cars, new CarPredicate() {
//            @Override
//            public boolean test(Car car) {
//                return car.getColor().equals("Green");
//            }
//        });
//        System.out.println(greenCars);

        List<Car> greenCars = filter(cars, car -> car.getColor().equals("Green"));
        List<Car> redCars = filter(cars, car -> car.getColor().equals("Red"));
        List<Car> filterByYearBefore = filter(cars, car -> car.getYear() < 2022);
        System.out.println(greenCars);
        System.out.println(redCars);
        System.out.println(filterByYearBefore);
        List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(filter(numbersList, number -> number % 2 == 0));
    }

    private static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> filteredList = new ArrayList<>();

        for (T e : list){
            if (predicate.test(e)){
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}