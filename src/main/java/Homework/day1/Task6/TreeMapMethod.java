package Homework.day1.Task6;


import java.util.TreeMap;

public class TreeMapMethod {

    public static void main(String[] args) {
        TreeMap<Integer,String> data = new TreeMap<>();
            data.put(1,"John");
            data.put(3,"Anna");
            data.put(50,"Martha");
            data.put(4,"Derek");
            data.put(10,"Christian");
            data.put(16,"David");

displayFirstAndLastEntrySet(data);
    }

    private static void displayFirstAndLastEntrySet (TreeMap<Integer, String> data){
        System.out.println("The first entry is: " + data.firstEntry());
        System.out.println("The last entry is: " + data.lastEntry());

    }
}
