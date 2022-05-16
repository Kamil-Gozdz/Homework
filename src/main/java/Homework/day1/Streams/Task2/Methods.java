package Homework.day1.Streams.Task2;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Methods {
    public static List<Programmer> getOnlyMen (List<Programmer> programmers) {
        return programmers.stream()
            .filter(p -> p.getPerson().getSex().equals("Man"))
            .collect(Collectors.toList());
    }
    public static List<Programmer> getNotAdultJavaProgrammers (List<Programmer> programmers){
        return programmers.stream()
            .filter(p -> p.getPerson().getAge()<= 18)
            .filter(p -> p.getProgrammingLanguages().contains("Java"))
            .collect(Collectors.toList());
    }
    public static List<Programmer> getProgrammersWhoKnowMoreThanOneLanguage(List<Programmer> programmers){
         return programmers.stream()
            .filter(p -> p.getProgrammingLanguages().size() > 1)
            .collect(Collectors.toList());
    }
    public static List<Programmer> getFemaleProgrammersWhichKnowCAndJava (List<Programmer> programmers){
        return programmers.stream()
            .filter(p -> p.getPerson().getSex().equals("Woman"))
            .filter(p -> p.getProgrammingLanguages().contains("C#") && p.getProgrammingLanguages().contains("Java"))
            .collect(Collectors.toList());
    }
    public static List<String> getMensNames (List<Programmer> programmers){
        return  programmers.stream()
            .filter(p -> p.getPerson().getSex().equals("Man"))
            .map(p -> p.getPerson().getName())
            .collect(Collectors.toList());
    }

    public static Set<String> getAllLanguages (List<Programmer> programmers){
        return programmers.stream()
            .map(Programmer::getProgrammingLanguages)
            .flatMap(List::stream)
            .collect(Collectors.toSet());
    }
    public static List<String> getProgrammersWhoKnowMoreThanTwoLanguages (List<Programmer> programmers){
        return programmers.stream()
            .filter(p -> p.getProgrammingLanguages().size() > 2)
            .map(p -> p.getPerson().getSurname())
            .collect(Collectors.toList());
    }
    public static boolean checkIfThereIsPersonWhoKnowsZeroLanguages (List<Programmer> programmers){
        return programmers.stream()
                .anyMatch(p -> p.getProgrammingLanguages().size() == 0);

    }
    public static long getLanguagesKnownByFemales (List<Programmer> programmers) {
        return programmers.stream()
                .filter(p -> p.getPerson().getSex().equals("Woman"))
                .map(Programmer::getProgrammingLanguages)
                .distinct()
                .count();

    }
}
