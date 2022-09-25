package streamApi;

import java.util.*;
import java.util.function.*;
import java.util.stream.Collectors;

public class exerciciosStreamApi {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "6", "5");

        System.out.println("\nImprima todos os elementos dessa lista de String");
        numerosAleatorios.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);

            }
        });

        // utilizando lambda
        //numerosAleatorios.stream().forEach(s -> System.out.println(s));
        numerosAleatorios.forEach(System.out::println);


        System.out.println("\nPegue os 5 primeiros números e coloque dentro de 1 Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        /*
        Set<String> collectSet = numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
        collectSet.forEach(System.out::println);
         */


        System.out.println("\n\nTransforme esta lista de String em uma lista de numeros inteiros");
        /*numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                });*/

        /*
        numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList())
                .forEach(System.out::println);
         */

        numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .forEach(System.out::println);


        /*
        List<Integer> collectset = numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String s) {
                        return Integer.parseInt(s);
                    }
                }).collect(Collectors.toList());
         */

        List<Integer> collectset = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .toList();


        System.out.println("\n\nPeguw os números pares maiores do que dois e coloque numa lista: ");
        numerosAleatorios.stream().map( s -> Integer.parseInt(s));

        // test 1
        List<Integer> paresMaiorQ2 = numerosAleatorios.stream()
                .map(Integer::parseInt).filter(i -> i %2 == 0 && i >2 ).collect(Collectors.toList());
        System.out.println(paresMaiorQ2);

        //teste3
        numerosAleatorios.stream()
                .map(Integer::parseInt).filter(i -> i %2 == 0 && i >2 ).forEach(System.out::println);

        // test2
        List<Integer> listParesMaiorQue2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer i) {
                        if (i % 2 == 0 && i > 2) return true;
                        return false;
                    }
                }).collect(Collectors.toList());
        System.out.println("listParesMaiorQue2 = " + listParesMaiorQue2);


        System.out.println("\nMostre a médioa dos números: ");

        //teste1
        numerosAleatorios.stream()
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String s) {
                        return Integer.parseInt(s);
                    }
                }).average()
                .ifPresent(System.out::println);

        //teste2
        numerosAleatorios.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double media) {
                        System.out.println("media2 = " + media);;
                    }
                });

        //teste3
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(media -> System.out.println("media3 = " + media));

        //teste4
        List<Double> media = new ArrayList<>();
        System.out.println("media éstá vazia? "+ media.isEmpty());
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double m) {
                        media.add(m);
                    }
                });
        System.out.println("media final = " + media);


        System.out.println("Remova os números impares: ");
        /*
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(new Function<String, Integer>() {
                    @Override
                    public Integer apply(String num) {
                        return Integer.parseInt(num);
                    }
                }).toList();
         */
        /*
        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(s -> Integer.parseInt(s)).toList();
         */

        List<Integer> numerosAleatoriosInteger = new ArrayList<>(numerosAleatorios.stream()
                .map(Integer::parseInt).toList());

        /*
        numerosAleatoriosInteger.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 != 0 ) return true;
                return false;
            }
        });
        System.out.println("numerosAleatoriosInteger = " + numerosAleatoriosInteger);
         */
        numerosAleatoriosInteger.removeIf(result -> (result %2 != 0) );
        TreeSet<LinkedHashSet> a = new TreeSet<>(){{

        }};


    }
}
