package com.example.myfirstandroidapplication;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
    private static final String[] imageUrls = {
            "https://images.unsplash.com/photo-1542362567-b07e54358753?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60",
            "https://images.pexels.com/photos/831475/pexels-photo-831475.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/112460/pexels-photo-112460.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/170811/pexels-photo-170811.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260",
            "https://images.pexels.com/photos/1974520/pexels-photo-1974520.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500"
    };

    private static final String[] carNames = {
            "Toyota", "BMW", "Audi", "Mercedes", "Volvo"
    };
    private static final String[] carColors = {
            "Red", "Green", "Orange", "Blue", "White"
    };

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public static List<DataModel> generate() {
        final List<DataModel> items = new ArrayList<>();
        for (int i = 0; i < imageUrls.length; i ++) {
            items.add(new DataModel(
                    carNames[i],
                    carColors[i],
                    imageUrls[i]
            ));
        }

        return items;
    }

    private String carName;

    public DataModel(String carName, String carColor, String imageurl) {
        this.carName = carName;
        this.carColor = carColor;
        this.imageurl = imageurl;
    }

    private String carColor;
    private String imageurl;
}
