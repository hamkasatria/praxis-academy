import java.util.HashMap;
import java.util.Map;

import sun.jvm.hotspot.utilities.ProgressiveHeapVisitor;

public class Inventory<T>{
    private Map<T, Integer> inventory = new HashMap<T, Integer>();

    public int getQuantity(T item){
        Integer value = inventory.get(item);
        return value == null ? 0 : value;
    }

    public add(T Item){
        int count = inventory.get(item);
        inventory.put(item, count+1);
    }

    public void deduct(T item){
        if (hasItem(item)){
            int cunt = inventory.get(item);
            inventory.put(item, count - 1);
        }
    }
    public boolean hasItem(T item){
        return getQuantity(item)>0;
    }

    public void clear()
    {
        inventory.clear();
    }

    public void put(T item, int quntitiy){
        inventory.put(item, quantity);
    }

    
}