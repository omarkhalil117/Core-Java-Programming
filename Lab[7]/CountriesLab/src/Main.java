import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        InMemoryWorldDao worldDao = InMemoryWorldDao.getInstance();

        // [1] Max population for each country

        Map<String, City> result = new HashMap<>();
        worldDao.countries.forEach((k, v) -> {
            City emp = v.getCities().stream()
                    .filter(e -> e != null)
                    .max(Comparator.comparingDouble(City::getPopulation))
                    .orElse(null);

            result.put(k, emp);
        });

        // print result
        result.forEach((k, v) -> {
            if (v != null)
                System.out.println(k + " " + v.getName());
        });

        // [2] Find the most populated city of each continent

        Map<String, List<City>> continentCities = new TreeMap<>();

        worldDao.countries.forEach((k, v) -> {

            String cont = v.getContinent();

            if (!continentCities.containsKey(cont)) {
                continentCities.put(v.getContinent(), v.getCities());
            } else {
                List<City> oldList = continentCities.get(cont);
                List<City> newList = v.getCities();
                oldList.addAll(newList);
                continentCities.put(cont, oldList);
            }

        });

        // get most populated city at each continent
        Map<String, City> res = new HashMap<>();

        continentCities.forEach((cont, cities) -> {
            City maxPopulatedCity = cities.stream()
                    .max(Comparator.comparingInt(City::getPopulation))
                    .orElse(null);
            res.put(cont, maxPopulatedCity);
        });

        // print the result
        res.forEach((k, v) -> {
            if (v != null)
                System.out.println("Continent = " + k + " , City = " + v.getName());
        });

        // [3] Find the highest populated capital city
        List<Integer> capitalCityCode = new ArrayList<>();

        // get capital cities codes
        worldDao.countries.forEach((k, v) -> {
            capitalCityCode.add(v.getCapital());
        });

        List<City> capitalCities = new ArrayList<>();

        // get capital Cities
        worldDao.cities.forEach((k, v) -> {
            if (capitalCityCode.contains(v.getId()))
                capitalCities.add(v);

        });

        // get highest population city
        City res2 = capitalCities
                .stream().max(Comparator.comparingInt(City::getPopulation))
                .orElse(null);

        System.out.println("Name : " + res2.getName() + " |  Population : " + res2.getPopulation());
    }
}
