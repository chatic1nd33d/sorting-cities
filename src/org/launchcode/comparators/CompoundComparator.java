package org.launchcode.comparators;

import org.launchcode.City;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by summe on 6/15/2017.
 */
public class CompoundComparator implements Comparator<City>{

    private List<Comparator<City>> comparators = new ArrayList<>();

    public void add(Comparator<City> c){
        this.comparators.add(c);
    }


    @Override
    public int compare(City o1, City o2) {
        int i = 0;
        int comparison;
        do {
            comparison = this.comparators.get(i).compare(o1, o2);
            i++;
        } while (comparison == 0 && i < this.comparators.size());
        return comparison;
    }
}

