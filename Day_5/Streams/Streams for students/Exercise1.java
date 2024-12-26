

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;




public class Exercise1 {

   public static void main(String[] args) {
      CountryDao countryDao= InMemoryWorldDao.getInstance();
      //write your answer here
     // ArrayList cityHightPopul = new ArrayList<>();
      List<City> cityHightPopul = countryDao.findAllCountries() 
      .stream()
      .map(country-> country.getCities()
      .stream()
      .max(Comparator.comparing(City::getPopulation)))
      .filter(Optional::isPresent).map(Optional::get)
      .collect(Collectors.toList());
      cityHightPopul.forEach(System.out::println);
          
   }

}