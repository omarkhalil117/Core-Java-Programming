import java.util.stream.Collectors;

import DataDir.City;
import DataDir.InMemoryWorldDao;

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();

        // [1] Max population for each country

        Map<String, City> result = new HashMap<>();
        worldDao.countries.forEach((k, v) -> {

            City maxCity = v.getCities().stream()
                    .filter(e -> e != null)
                    .max(Comparator.comparingDouble(City::getPopulation))
                    .orElse(null);
            String cName = worldDao.countries.get(k).getName();
            result.put(cName, maxCity);
        });

        // print result
        result.forEach((k, v) -> {
            if (v != null)
                System.out.println(k + " " + v.getName());
        });

        System.out.println("/////////////////////////////////////////////////////");

        // [2] Max Population city in every continent
        Map<String, Optional<City>> result2 = worldDao.getCities().values().stream()
                .collect(
                        Collectors.groupingBy(city -> worldDao
                                .findCountryByCode(city.getCountryCode())
                                .getContinent(), // get city continent
                                Collectors.maxBy(Comparator.comparing(City::getPopulation))) // get max populated city
                );

        // Result
        result2.forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });

        System.out.println("/////////////////////////////////////////////////////");

        // [3] Get Most populated capital city

        Optional<City> result3 = worldDao.getCities().values().stream()
                .filter(city -> city.getId() == worldDao.findCountryByCode(city.getCountryCode()).getCapital())
                .collect(Collectors.maxBy(Comparator.comparingInt(City::getPopulation)));

        // get all capital cities
        // get the most populated city

        System.out.println("Most populated City is :");
        System.out.println("City : " + result3.get().getName() + " Population : " + result3.get().getPopulation());

    }
}
