package Homework.day1.Task5;

public class Demo {
    public static void main(String[] args) {
        SDAHashSet<String> data = new SDAHashSet<>();
        data.add("Kamil");
        data.add("Wojtek");
        data.add("Bartek");
        data.add("Szymon");
        data.add("Krystian");
        System.out.println(data.size());
        data.remove("Bartek");
        System.out.println(data.size());
        System.out.println(data.contains("Kamil"));
        data.clear();
        System.out.println(data.size());
    }
}
