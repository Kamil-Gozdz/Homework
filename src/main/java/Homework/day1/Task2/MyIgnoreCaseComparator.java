package Homework.day1.Task2;

import java.util.Comparator;
import java.util.Locale;


public class MyIgnoreCaseComparator implements Comparator<String> {


    @Override
    public int compare(String o1, String o2) {
        return -o1.toLowerCase().compareTo(o2.toLowerCase());
    }
}
