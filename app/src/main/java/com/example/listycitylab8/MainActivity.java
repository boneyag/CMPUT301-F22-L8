package com.example.listycitylab8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView cityList;

    ArrayAdapter<City> cityAdapter;
    CityList dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cityList = (ListView) findViewById(R.id.city_list);

        String cities[] = {"Edmonton", "Calgary", "Vancouver", "Toronto", "Montreal", "Saskatoon", "Victoria", "Ottawa", "Quebec City", "London", "Kingston"};
        String provinces[] = {"AB", "AB", "BC", "ON", "QC", "SK", "BC", "ON", "QC", "ON", "ON"};

        dataList = new CityList();

        for (int i=0; i<cities.length; i++){
            dataList.addCity(new City(cities[i], provinces[i]));
        }

        cityAdapter = new CustomCityAdapter(this, R.layout.content, dataList.getCities());

        cityList.setAdapter(cityAdapter);
    }
}