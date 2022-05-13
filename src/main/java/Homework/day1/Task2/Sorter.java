package Homework.day1.Task2;

import java.util.*;
import java.util.stream.Collectors;

public class Sorter {

    public static List<String> sortListFromZToAUsingAnonymousClass(final List<String> unsorted){
        List <String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                o1.compareTo(o2);
                return o2.toLowerCase(Locale.ROOT).compareTo(o1.toLowerCase(Locale.ROOT));
            }
        });
        return sorted;
    }
    public static List<String> sortUsingOwnComparator(final List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        sorted.sort(new MyIgnoreCaseComparator());
        return sorted;
    }

    public static List<String> sortListFromZToAUsingLambda(final List<String> unsorted){
        List <String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, (o1, o2) -> o1.compareTo(o2));
        Collections.sort(sorted,(o1, o2) -> o2.compareToIgnoreCase(o1));
            return sorted;
    }

    public static List<String> sortListFromZToAUsingStream(final List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList());
    }

}
