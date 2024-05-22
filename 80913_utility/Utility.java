package usingJava8Features;

import java.util.List;

public class Utility {
    public static void main(String[] args) {
        List<String> cities = List.of("New York", "London", "Sydney", "Tokyo");
        cities.stream()
              .filter(city -> city.startsWith("S"))
              .map(String::toUpperCase)
              .forEach(System.out::println);
    }
}