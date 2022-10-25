package com.example.listycitylab8;

public class City implements Comparable<City>{

    private String city;
    private String province;

    public City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Set the city
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * Set the province
     * @return String
     */

    public String getProvince() {
        return province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCity());
    }
}
