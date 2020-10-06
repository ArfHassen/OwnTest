package java8;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.stream.Collectors.toList;

/**
 * @author : arfaoui
 * @since : 16/01/2020
 * project : Test
 */
public class LazinessStreamDemo {
    public static void main(String[] args) {
        List<Integer> nombres = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> troisPremierNombrePairAuCarre =
                nombres.stream()
                        .filter(n -> {
                            System.out.println("filter " + n);
                            return n % 2 == 0;
                        })
                        .map(n -> {
                            System.out.println("map " + n);
                            return n * n;
                        })
                        .limit(3)
                        .collect(toList());

        System.out.println("");
        troisPremierNombrePairAuCarre.forEach(System.out::println);
        /*
         *Intermediare operation don't realise any treatement unless terminal operation are invoked.
         * Which let perform some optimisation in their execution
         * Not all elements are iterated
         * filter operation is invoked only 6 times and map 3 times
         * limit return et stream with only 3 elements
         * operations are grouped into a single iteration which processes each elements by applying operation pipeline to it (operations do not iterate individually on stream elements).
         * Les opérations sont regroupées en une seule itération qui traite chaque élément en lui application le pipeline d'opérations : les opérations n'itèrent pas individuellement sur les éléments du Stream
         */
    }
}
