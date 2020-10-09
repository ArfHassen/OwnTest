package pack2020.thread;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/*
ConcurrentMap(CM) is an extension of Map(M) interface
By overriding several interface default methods, ConcurrentMap gives guidelines for valid implementations to provide thread-safety and memory-consistent atomic operations.

Several default implementations are overridden, disabling the null key/value support:

getOrDefault
forEach
replaceAll
computeIfAbsent
computeIfPresent
compute
merge

The following APIs are also overridden to support atomicity, without a default interface implementation:

putIfAbsent
remove
replace(key, oldValue, newValue)
replace(key, value)
M accept only one null key, CM does not it will throw null pointer exception when trying to put null key element
 */
public class ThreadOnCollection {
    public static void main(String[] args) throws InterruptedException {
        //synchronizedArrayListCollectionExemple();
        multiThreadingConcurrentHashMap();
    }

    private static void synchronizedArrayListCollectionExemple() throws InterruptedException {
        /*
        Collections.synchronizedCollection is thread save but does not give an efficiency solution because it synchronize all map
         */
        Collection<Integer> integers = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread_1 = new Thread(() -> integers.addAll(Arrays.asList(1, 2, 3, 4, 5)));
        Thread thread_2 = new Thread(() -> integers.addAll(Arrays.asList(6, 7, 8, 9, 10)));
        thread_1.start();
        thread_2.start();
        thread_2.join();
        System.out.println(integers);
    }

    private static void simpleArrayListCollectionExemple() throws InterruptedException {
        Collection<Integer> integers = new ArrayList<>();
        Thread thread_1 = new Thread(() -> integers.addAll(Arrays.asList(1, 2, 3, 4, 5)));
        Thread thread_2 = new Thread(() -> integers.addAll(Arrays.asList(6, 7, 8, 9, 10)));
        thread_1.start();
        thread_2.start();
        thread_2.join();
        //Thread.sleep(200);
        System.out.println(integers);
    }

    private static void multiThreadingHashMap() throws InterruptedException {
        /*
        result will not be good
        it will throw exception when we nvigate it and trying to add (modify structure) element #ConcurrentModificationException
         */
        Map<Integer, Integer> map = new HashMap<>();
        Thread thread_1 = new Thread(() -> {
            map.put(1, 1);
            map.put(2, 2);
            map.put(3, 3);
            map.put(4, 4);
        });
        Thread thread_2 = new Thread(() -> {
            map.put(5, 5);
            map.put(6, 6);
            map.put(7, 7);
            map.put(8, 8);
        });
        thread_1.start();
        thread_2.start();
        thread_2.join();
        System.out.println(map);
    }

    private static void multiThreadingConcurrentHashMap() throws InterruptedException {
        /*
         It allows concurrent access to the map. Part of the map called Segment (internal data structure) is only getting locked while adding or updating the map.
         So ConcurrentHashMap allows concurrent threads to read the value without locking at all. This data structure was introduced to improve performance

         Concurrency-Level: Defines the number which is an estimated number of concurrently updating threads. The implementation performs internal sizing to try to accommodate this     many threads.

          Load-Factor: It's a threshold, used to control resizing.

         Initial Capacity: The implementation performs internal sizing to accommodate these many elements.

       A ConcurrentHashMap is divided into number of segments, and the example which I am explaining here used default as 32 on initialization.

      A ConcurrentHashMap has internal final class called Segment so we can say that ConcurrentHashMap is internally divided in segments of size 32, so at max 32 threads can work at a time. It means each thread can work on a each segment during high concurrency and atmost 32 threads can operate at max which simply maintains 32 locks to guard each bucket of the ConcurrentHashMap.
         */
        Map<Integer, Integer> map = new ConcurrentHashMap<>();
        Thread thread_1 = new Thread(() -> {
            map.put(1, 1);
            map.put(2, 2);
            map.put(3, 3);
            map.put(4, 4);
        });
        Thread thread_2 = new Thread(() -> {
            map.put(5, 5);
            map.put(6, 6);
            map.put(7, 7);
            map.put(8, 8);
        });
        thread_1.start();
        thread_2.start();
        thread_2.join();
        System.out.println(map);
    }


}
