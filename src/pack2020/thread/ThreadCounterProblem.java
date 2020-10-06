package pack2020.thread;

import java.util.concurrent.atomic.AtomicInteger;

/*
difference between i++ and AtomicInteger.incrementAndGet() :
1/ i++ need 3 opération :
 - get value
 - increment it
 - save new value (in register also)
all this operation maybe be interference when called by multiple thread

2/ atomic mecanism garantie that all this operation will be made in on operation so more than one thread can't interfer
 */
public class ThreadCounterProblem {
    public static void main(String[] args) {

    }

    private void SimpleCounterCall() {
        /*
        Thread will end with race condition: more than one thread trying accessing shared resource(modify,write)
        shared resource like: class variable, db record or writing in a file
         */
        Counter counter = new Counter();
        /*
        here we have 1000 thread sharing counter instance variable of an object (counter) of Counter class
         */
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> counter.increment()).start();
        }
        System.out.println(counter.getCounter());
    }

    private void AtomicCounterCall() {
        /*
        increment will be done in atomic operation :
         */
        AtomicCounter counter = new AtomicCounter();
        for (int i = 0; i < 1000; i++) {
            new Thread(() -> counter.incrementAtom()).start();
        }
        System.out.println(counter.getAtom());
    }

    static class Counter {
        private int counter = 0;

        public void increment() {
            counter++;
        }

        public int getCounter() {
            return counter;
        }
    }

    static class AtomicCounter {
        private AtomicInteger atom = new AtomicInteger(0);

        public void incrementAtom() {
            atom.incrementAndGet();
        }

        public int getAtom() {
            return atom.get();
        }
    }
}
