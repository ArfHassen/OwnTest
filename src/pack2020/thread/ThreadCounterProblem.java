package pack2020.thread;

import java.util.concurrent.atomic.AtomicInteger;

/*
atomic operation mean that the operation can't be partially executed, all instructions are guarantee to be executed without interruption
In java only read and write operation in variable are atomique except long and double.
i++ is not atomic because it require three operation:
  - read value from memory.
  - increment it.
  - write new value in memory
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



     static class AnotherImplCounterProblem {
        public static void main(String[] args) throws InterruptedException {
            final MonCompteur compteur = new MonCompteur();
            Thread[] threads = new Thread[20];
            Runnable thread = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        compteur.getNextValue();
                    }
                }
            };

            for (int i = 0; i < 20; i++) {
                threads[i] = new Thread(thread);
                threads[i].start();
            }

            for (int i = 0; i < 20; i++) {
                threads[i].join();
            }

            System.out.println(compteur.getValue());
        }

         static class MonCompteur {
             private int valeur;

             public int getValue() {
                 return valeur;
             }

             public int getNextValue() {
                 return ++valeur;
             }
         }
    }
}
