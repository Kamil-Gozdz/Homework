package Homework.day1.Task5;

import java.util.HashMap;
import java.util.Map;

public class SDAHashSet<E> {

private Map<E,?> map = new HashMap<>();

    public void add(E object) {
        map.put(object,null);
    }
    public void remove(E object){
        map.remove(object);
    }
    public int size(){
        return map.size();
    }
    public boolean contains(E object){
        return map.containsKey(object);
    }
    public void clear(){
        map.clear();
    }
}
