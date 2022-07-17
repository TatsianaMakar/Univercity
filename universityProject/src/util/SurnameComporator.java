package util;

import base.People;

import java.util.Comparator;

public class SurnameComporator implements Comparator<People> {
    @Override
    public int compare(People o1, People o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
