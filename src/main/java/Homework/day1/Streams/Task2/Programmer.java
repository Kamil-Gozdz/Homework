package Homework.day1.Streams.Task2;

import java.util.List;

public class Programmer {
private Person person;
private List<String> programmingLanguages;

    public Programmer(Person person, List<String> programmingLanguages) {
        this.person = person;
        this.programmingLanguages = programmingLanguages;
    }

    public Person getPerson() {
        return person;
    }

    public List<String> getProgrammingLanguages() {
        return programmingLanguages;
    }
}
