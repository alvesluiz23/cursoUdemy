package genericAndSet;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> values = new ArrayList<>();

    public void add(T value){
        values.add(value);
    }

    public T first(){
        if(values.isEmpty()) throw new ArrayIndexOutOfBoundsException("Array is empty");
        return values.get(0);
    }

    public void print(){
          System.out.println(values);
    }

}
