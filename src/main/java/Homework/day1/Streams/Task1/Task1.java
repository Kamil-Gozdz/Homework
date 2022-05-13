package Homework.day1.Streams.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static List<String> search (final List<String> values){
       List<String> searched = new ArrayList<>(values);
        return searched.stream()
                .filter(value -> value.startsWith("c"))
                .filter(value -> value.length() == 3)
                .collect(Collectors.toList());
    }

    public static String getString (List<Integer> values){
        return values.stream()
                .map(v ->{
                    if (v % 2 != 0) {
                       return "o" + v;
                    }else
                    return "e" + v;
                    })
                .collect(Collectors.joining(","));
    }
}
