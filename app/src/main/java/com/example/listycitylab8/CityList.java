package com.example.listycitylab8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     */
    public void addCity(City city){
        if (cities.contains((city))) {
            throw new IllegalArgumentException();
        } else {
            cities.add(city);
        }
    }

    /**
     * This returns a sorted list of cities
     * @return
     *      Return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    public boolean deleteCity(City city){
        if (cities.contains(city)){
            cities.remove(city);
            return true;
        }
        return false;
    }

    public int countCities(){
        return cities.size();
    }
}
