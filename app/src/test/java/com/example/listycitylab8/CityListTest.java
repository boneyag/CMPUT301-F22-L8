package com.example.listycitylab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CityListTest {
    private CityList mockCityList(){
        CityList cityList = new CityList();
        cityList.addCity(mockCity());
        return cityList;
    }

    private City mockCity(){
        return new City("Red Deer", "AB");
    }

    @Test
    void testAddCity(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        cityList.addCity(new City("Saskatoon", "SK"));
        assertEquals(2, cityList.getCities().size());
    }

    @Test
    void testDeleteCity(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());

        cityList.addCity(new City("Saskatoon", "SK"));
        assertEquals(2, cityList.getCities().size());

        City newCity = new City("Calgary", "AB");
        cityList.addCity(newCity);
        assertTrue(cityList.deleteCity(newCity));

    }

    @Test
    void testCountCities(){
        CityList cityList = mockCityList();
        assertEquals(1, cityList.countCities());
    }
}
