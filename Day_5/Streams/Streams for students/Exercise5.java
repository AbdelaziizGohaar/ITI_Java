



import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.lang.System.out;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

import java.util.Comparator;
import java.util.List;

public class Exercise5 {

    public static void main(String[] args) {
        CountryDao countryDao = InMemoryWorldDao.getInstance();
        CityDao cityDao = InMemoryWorldDao.getInstance();
       //write your answer here 
       // find the hight Populate capital City 

  
       Optional<City> capCityHightPopul =
        countryDao
       .findAllCountries() 
       .stream()
       .map(country-> cityDao.findCityById(country.getCapital()))
          .filter(o->o != null)
          .max(Comparator.comparing(City::getPopulation));
        System.out.println(capCityHightPopul);
       
 
    }

}