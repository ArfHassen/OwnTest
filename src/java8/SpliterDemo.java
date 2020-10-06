package java8;

import java.util.function.IntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author : arfaoui
 * @since : 24/01/2020
 * project : Test
 */
public class SpliterDemo {
    static final String SENTENCE =
            " Nel mezzo del cammin di nostra vita " +
                    "mi ritrovai in una selva oscura" +
                    " ché la dritta via era smarrita ";

    public static void main(String[] args) {
        //System.out.println("found "+countWordsIterativly(SENTENCE)+ " words");
        IntFunction<Character> func = i -> SENTENCE.charAt(i);
        Stream<Character> stream = IntStream.range(0, SENTENCE.length()).mapToObj(func);
        stream.forEach(System.out::println);
    }

    static public int countWordsIterativly(String str){
        int counter = 0;
        boolean isLastSpace = true;
        for(char c : str.toCharArray()){
            if(Character.isWhitespace(c)){
                isLastSpace = true;
            }else{
                if(isLastSpace)counter++;
                isLastSpace = false;
            }
        }
        return counter;
    }
}
