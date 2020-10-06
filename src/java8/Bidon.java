package java8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class Bidon {
    public static void main(String[] args) {
        /*BiFunction<Integer,Integer,Integer> bi = (a, b)->a+b;
        BinaryOperator<Integer> biOp = (a, b)->a+b;
        run(bi,biOp);*/
        new Bidon().var();
    }

    private  void var() {
        MyNode mn = new MyNode(5);
        Node n = mn;            // A raw type - compiler throws an unchecked warning
        n.setData("Hello");
        Integer x = mn.data;    // Causes a ClassCastException to be thrown.
    }

    public static void run(BiFunction<Integer,Integer,Integer> bi, BinaryOperator<Integer> bi2){
        int rs = bi.apply(1,2);
        int rs2 = bi2.apply(10,11);
        System.out.println(rs);
        System.out.println(rs2);
    }
     class Node<T> {

        public T data;

        public Node(T data) { this.data = data; }

        public void setData(T data) {
            System.out.println("Node.setData");
            this.data = data;
        }
    }

    public class MyNode extends Node<Integer> {
        public MyNode(Integer data) { super(data); }

        public void setData(Integer data) {
            System.out.println("MyNode.setData");
            super.setData(data);
        }
    }
}
