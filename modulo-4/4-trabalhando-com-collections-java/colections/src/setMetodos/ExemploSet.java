package setMetodos;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto e adicone as notes: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d,  8.5, 9.3, 5d, 7d, 8d, 3.6));
        System.out.println(notas.toString()); //hash set tem ordem aleatória e podem se repitir


        System.out.println("Exiba a posição da nota 5.0"); // com set não consigo fazer essa busaca


        System.out.println("Adicone a lista a nota 0.1 na posição 4"); // sets não possui index


        System.out.println("Substitua a nota 5 pela nota6"); // não tem como



        System.out.println("Confira se a nota 5.0 Está no conjuntos: "+ notas.contains(5d));


        System.out.println("Exiba a terceira nota adicionada"); //também não é possível pois não temos o método get


        System.out.println("Exiba a menor nota: "+ Collections.min(notas));


        System.out.println("Exiba a mair nota: "+ Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exibir a soma dos valores"+ soma);


        System.out.println("Exima a média das notas: "+ (soma / notas.size()));


        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);


        System.out.println("Remova a nota na posição 0");
        // Não pode ser feito porque SET não trabalha com index.


        System.out.println("Remova as notas  menores que 7  e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator.hasNext()){
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);


        System.out.println("Exiba todas as notas na oredem que foram formadas");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);


        System.out.println("EXiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();

        System.out.println("Confira se o conjunto está vazio: "+ notas2.isEmpty());
        System.out.println("Confira se o conjunto 2 está vazio: "+ notas2.isEmpty());
        System.out.println("Confira se o conjunto 3 está vazio: "+ notas3.isEmpty());


    }
}
