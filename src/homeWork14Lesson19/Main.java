package homeWork14Lesson19;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        String path = "src/HMWork14.txt";
        //1ое задание
        try (BufferedReader bufferedReader =
                     new BufferedReader
                             (new FileReader
                                     (path))) {
        bufferedReader.lines().map(car ->{
            String[] parsedLines = car.split("#");
            return new Car(Integer.parseInt(parsedLines[0]), parsedLines[1], parsedLines[2], Integer.parseInt(parsedLines[3]), Integer.parseInt(parsedLines[4]));
        }).filter(car -> car.getColor().equals("Black") || car.getKms().equals(0)).forEach(car -> System.out.println(car.getCarNum()));
        }
        //2
        try (BufferedReader bufferedReader =
                     new BufferedReader
                             (new FileReader
                                     (path))) {
            List<Car> list = bufferedReader.lines().map(car -> {
                String[] parsedLines = car.split("#");
                return new Car(Integer.parseInt(parsedLines[0]), parsedLines[1], parsedLines[2], Integer.parseInt(parsedLines[3]), Integer.parseInt(parsedLines[4]));
            }).filter(car -> 700000 < car.getPrice() && car.getPrice() < 800000).collect(Collectors.toList());
            List<String> carModelsString = new ArrayList<>();
            for (Car car : list) {
                carModelsString.add(car.getModel());
            }
            System.out.println("Количество уникальных машин в ценовом диапазоне 700-800 тысяч: "
                    + carModelsString.stream().distinct().count());
        }
        //3
        try (BufferedReader bufferedReader =
                     new BufferedReader
                             (new FileReader
                                     (path))) {
            System.out.println("Цвет автомобиля с мин стоимостью: " + bufferedReader.lines().map(car -> {
                String[] parsedLines = car.split("#");
                return new Car(Integer.parseInt(parsedLines[0]), parsedLines[1], parsedLines[2], Integer.parseInt(parsedLines[3]), Integer.parseInt(parsedLines[4]));
            }).min(Comparator.comparing(Car::getPrice)).get().getColor());

        }

        //4.1
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            List<Car> camryList;
            int camrySum = 0;
            camryList = bufferedReader.lines().map(line -> {
                String[] parsedLines = line.split("#");
                return new
                        Car(Integer.parseInt(parsedLines[0]), parsedLines[1], parsedLines[2], Integer.parseInt(parsedLines[3]), Integer.parseInt(parsedLines[4]));
            }).filter(car -> car.getModel().equals("Camry")).collect(Collectors.toList());
            for (Car car : camryList) {
                camrySum = camrySum + car.getPrice();
            }
            System.out.println(camrySum / camryList.size());
        }
        //4.2 реализация с FlatMap
        try (BufferedReader bufferedReader =
                     new BufferedReader
                             (new FileReader
                                     (path))) {
            System.out.println((int)bufferedReader.lines().map(line -> {
                String[] parsedLines = line.split("#");
                return new
                        Car(Integer.parseInt(parsedLines[0]), parsedLines[1], parsedLines[2], Integer.parseInt(parsedLines[3]), Integer.parseInt(parsedLines[4]));
            }).filter(car -> car.getModel().equals("Camry")).flatMapToInt(car -> IntStream.of(car.getPrice())).average().getAsDouble());
        }

    }
}
