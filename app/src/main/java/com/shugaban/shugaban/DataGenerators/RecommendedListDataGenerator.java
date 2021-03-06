package com.shugaban.shugaban.DataGenerators;

import com.shugaban.shugaban.Models.MovieModel;

import java.util.ArrayList;
import java.util.List;

public class RecommendedListDataGenerator {

    // DECLARING THE DATA ARRAY LIST
    static List<MovieModel> allData = new ArrayList<>();

    // SETTING/RESETTING ALL SUGGESTED LINKUPS DATA
    public static void setAllDatasAfresh(List<MovieModel> newAllData) {
        RecommendedListDataGenerator.allData = newAllData;
    }

    // ADDING ONE DATA TO ARRAY LIST
    public static boolean addOneData(MovieModel model) {
        return allData.add(model);
    }

    // GETTING ALL DATA AS ARRAY LIST
    public static List<MovieModel> getAllData() {
        return allData;
    }

    // ADDING ONE DATA TO A DESIRED POSITION IN ARRAY LIST
    public static void addOneDataToDesiredPosition(int i, MovieModel model){
        allData.add(i, model);
    }
}
