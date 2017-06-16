package org.launchcode.comparators;

import org.launchcode.City;

import java.util.Comparator;

/**
 * Created by summe on 6/15/2017.
 */
public class AreaComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {

        if (o2.getArea() < o1.getArea()){
            return -1;
        } else if (o2.getArea() > o1.getArea()){
            return 1;
        } else {
            return 0;
        }
    }
}