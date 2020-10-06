package pack2020.thread;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ThreadOnCollection {
    public static void main(String[] args) {
        synchronizedCollectionExemple();
    }

    private static void synchronizedCollectionExemple() {
        Collection<Integer> integers = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread_1 = new Thread(()->integers.addAll(Arrays.asList(1,2,3,4,5)));
        Thread thread_2 = new Thread(()->integers.addAll(Arrays.asList(6,7,8,9,10)));
        thread_1.start();
        thread_2.start();
        System.out.println(integers);
    }


}
