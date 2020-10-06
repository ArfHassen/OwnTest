package divers;

import java.util.*;

/**
 * @author : arfaoui
 * @since : 29/01/2019
 * project : espace-adherent-v2
 */
public class ManyTests {
    static public void main(String...args){
        //System.out.println(trgt.listIn);
       /* List<String> list = new ArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        list.add("dd");
        for(String s:list){
            if(s.equalsIgnoreCase("bb"))
                list.remove(s);
        }*/
        /*Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String elem = it.next();
            System.out.println(elem);
            if(elem.equals("bb"))
            it.remove();
            //list.remove(elem);
            //list.add("ee");
        }*/
        //System.out.println(list);
        /*Integer it2 = new Integer(5);
        modify(it2);
        System.out.println("after "+it2);
        String symbol = "\u002B";
        System.out.println("---"+symbol);
        String str = new String("Abcer");
        byte[] bo = str.getBytes();
        System.out.println(bo);
        Optional<String> opt = Optional.ofNullable(null);
        if(opt.isPresent())
        System.out.println(opt.get());
        String digitalPattern = "\\p{L}*";
        String strr = "abéà";
        Pattern pattern = Pattern.compile(digitalPattern);
        Matcher matcher = pattern.matcher(strr);
        System.out.println(strr+" not contain number "+matcher.matches());
        //
        boolean bl = isPremier(5);
        System.out.println(bl);
        //
        Set<Integer> set = new TreeSet();
        set.add(5);set.add(10);set.add(1);
        System.out.println(set);
        //type
        long x = 2147483649l;
        int it = (int)x;
        System.out.println("it :"+it);
        // byte to String
        byte tab[] = {65,67,66};
        String s = new String(tab);
        System.out.println("..."+s);
        //
        Map map = new HashMap<>();
        map.put("11",123);
        map.put("22",456);
        List<String> li = new ArrayList<>(map.entrySet());
        System.out.println(li);
        LinkedList<String> linked = new LinkedList<>();
        linked.add("11");
        linked.add("22");
        linked.add("33");
        linked.remove("22");
        ConcurrentHashMap<String, String> c = new ConcurrentHashMap<>();
        Set<String> c_ = new HashSet<>();
        Set<String> c__ = (HashSet<String>)Collections.synchronizedCollection(c_);
        StringBuilder sb = new StringBuilder("123");
        sb.append("4567").append("8459876");
        System.out.println(sb.toString());
       new Test().ConcurrentModificationExemple();
        List<Integer> ll = My_Array.asList(1,2,3);
        System.out.println(ll);*/

    }

    private static void modify(Integer it2) {
        it2 = new Integer(8);
        System.out.println("local :"+it2);
    }

    static public boolean isPremier(int n){
        if(n<=1) return false;
        for(int i = 2;i*i<=n;i++){
            if (n%i ==0) {
                return false;
            }
        }
        return true;
    }
    private void genericDemo(){
        Class<?> c= String.class;
        Class clazz = eq(String.class);
        String str = eq_(String.class);
    }
    private static <T> T eq(T value) {
        return(T)value;
    }
    private static <T> T eq_(Class<T> value) {
        return(T)value;
    }
    private void ConcurrentModificationExemple(){
        List<String> list_ = new ArrayList<>();
        list_.add("1");
        list_.add("2");
        list_.add("3");
        list_.add("4");
        //Iterator<String> it = list_.iterator();
        //ListIterator<String> lit = list_.listIterator(); use listIterator to have 2 sides to navigate list
        //list_.removeIf(i -> i.equals("2")); java 8 solution to resolve exception
        /*
        solution to avoid exception; delete with iterator
         */
        for(Iterator<String> it = list_.iterator(); it.hasNext();){
            String str = it.next();
            if(str.equals("3")){
                /*
                modCount will be increment and expectedModCount will have the same value
                so after that when iterate and call it.next, checkForComodification will return true
                 */
                it.remove();
            }
        }
        /*
        in the code below
        when remove directly in list, variable modCount(which count the number of modification made in list) increment
        when continue iterate after that exception will be thrown
         */
        /*for(String s : list_){
            if(s.equals("4"))
            //when remove, only modCount will be increment, when re ierate on List next , checkForComodification will return false
                list_.remove(s);
        }*/
        System.out.println(list_);
        /*
          Iterator fail-fast property checks for any modification in the structure of the underlying collection
          everytime we try to get the next element. If there are any modifications found,
          it throws ConcurrentModificationException. All the implementations of
          Iterator in Collection classes are fail-fast by design except the concurrent
          collection classes like ConcurrentHashMap and CopyOnWriteArrayList.
         */
        //List<String> myList = new CopyOnWriteArrayList<String>(); use to avoid exception
    }
    private void castionDemo(){
        /* B b = new B();
        D d = (D)b;
       // List<I> list = new ArrayList<C>();false, polymorfic decalaration is allowed only with type (List)
        List<? extends I> list = new ArrayList<C>();
        List<I> listi = new ArrayList<I>();
        //List<C> listc = (List<C>) listi;*/
    }

}

interface I{}

abstract class A{}

class B extends A{}

class C implements I {}

class D extends B{}

class My_Array{
    static public <T> List<T> asList(T...a){
        return new MyArrayList(a);
    }
    static class MyArrayList<E> extends AbstractList<E> {
        private E[] a;
        private int b ;
        MyArrayList(E[] array){
            a = Objects.requireNonNull(array);
            b = 15;
        }
        @Override
        public E get(int index) {
            return a[index];
        }
        @Override
        public int size() {
            return a.length;
        }
    }
}

interface AA {
   default public String a() { return "a";}
}

interface BB {
   default public String a() { return "b";}
}

class CC implements AA,BB {

   //if we dont override we have a complie exception (inhereit 2 methods - multiple inherit)
    @Override
    public String a() {
        return null;
    }
}
 class Target{
    private int a=0;
    private List<PersonneB> listIn = new ArrayList<>() ;
     public int getA() {
         return a;
     }

     public void setA(int a) {
         this.a = a;
     }

     public List<PersonneB> getListIn() {
         return listIn;
     }

     public void setListIn(List<PersonneB> listIn) {
         this.listIn = listIn;
     }
 }
 class Source{
     int a = 1;
     List<PersonneA> listIn = new ArrayList<>();

     public int getA() {
         return a;
     }

     public void setA(int a) {
         this.a = a;
     }

     public List<PersonneA> getListIn() {
         return listIn;
     }

     public void setListIn(List<PersonneA> listIn) {
         this.listIn = listIn;
     }
 }
 class PersonneA{
    private String name ="";
    PersonneA(String n){
        name=n;
    }
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }
 }
class PersonneB{
    private String name ="";
    PersonneB(String n){
        name=n;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
