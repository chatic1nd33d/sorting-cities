package org.launchcode;

import org.launchcode.comparators.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<City> cities = CityData.loadData();

        // TODO - Use different comparators here
        CompoundComparator cc = new CompoundComparator();
        NameComparator nc = new NameComparator();
        PopulationComparator pc = new PopulationComparator();
        cc.add(nc);
        cc.add(pc);
        cities.sort(cc);
        printCities(cities);

    }

    private static void printCities(ArrayList<City> cities) {

        System.out.println(City.getTableHeader());

        for(City c : cities) {
            System.out.println(c);
        }

    }
}
