package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericTypeErasureDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{3,2,11,14,20,6,9};
        //java7impl(array);
        /*java8impl(array);*/
        swap(array, 1, 3);
        System.out.println(Arrays.toString(array));
        List<? extends Integer> li = new ArrayList<>();
    }
    public static <T> void helper(List<T> li){

        //li.add(45);
    }

    private static void java8impl(Integer[] array) {
        int oddNumber = count(array, integ->integ%2!=0);
        System.out.println("java 8 : " +oddNumber);
        int pairNumber = count(array, integ->integ%2==0);
        System.out.println("java 8 : "+pairNumber);
    }

    private static void java7impl(Integer[] array) {
        int oddNumber = count(array, new OddNumber());
        System.out.println(oddNumber);
        int pairNumber = count(array, new PairNumber());
        System.out.println(pairNumber);
    }

    public static <T> int count(T[] array, UnaryPredicate<T> unaryPredicate){
        int count = 0;
        for(T elem : array){
            if(unaryPredicate.test(elem)){
                count++;
            }
        }
        return count;
    }

    public static <T> void swap(T[] array, int pos1, int pos2){
        T temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }

    static interface UnaryPredicate<T>{
        boolean test(T t);
    }
    static class OddNumber implements UnaryPredicate<Integer>{

        @Override
        public boolean test(Integer integer) {
            return integer%2!=0;
        }
    }
    static class PairNumber implements UnaryPredicate<Integer>{

        @Override
        public boolean test(Integer integer) {
            return integer%2==0;
        }
    }

}

class AnimalHouse<E> {
private E animal;
public void setAnimal(E x) {
        animal = x;
        }
public E getAnimal() {
        return animal;
        }
        }

class Animal{
}

 class Cat extends Animal {
}

 class Dog extends Animal {
}
