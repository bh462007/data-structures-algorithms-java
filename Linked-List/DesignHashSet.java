
import java.util.LinkedList;

class MyHashSet {
    LinkedList<Integer>[] buckets;
    int size;

    public MyHashSet() {
        size=1000;
        buckets=new LinkedList[size];
        for (int i = 0; i < size; i++) {
            buckets[i]=new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int index=key%size;
        if(!buckets[index].contains(key)){
            buckets[index].add(key);
        }
    }
    
    public void remove(int key) {
        int index=key%size;
        buckets[index].remove((Integer) key);
    }
    
    public boolean contains(int key) {
        int index=key%size;
        return buckets[index].contains(key);
    }
}
public class DesignHashSet {
    public static void main(String[] args) {

        MyHashSet set = new MyHashSet();

        set.add(1);
        set.add(2);

        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(3)); // false

        set.add(2);
        System.out.println(set.contains(2)); // true

        set.remove(2);
        System.out.println(set.contains(2)); // false
    }
}