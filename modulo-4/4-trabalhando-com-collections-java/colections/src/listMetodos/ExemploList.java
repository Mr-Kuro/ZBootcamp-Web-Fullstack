package listMetodos;

import java.util.*;

public class ExemploList  {
    public static void main(String[] args) {

//      List notas = new ArrayList();
//      List<Double> notas = new ArrayList<>();
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.2, 4.4, 4.8,6.2));
//      List<Double> notas = Arrays.asList(7d,8.5, 9.2, 5d, 3.6);  // não posso adicionar e nem remover
//      notas.add(10d);
//      System.out.println(notas);
//        List<Double> notas = List.of(7d, 2.5, 6d, 7.5419857174162145);
//        notas.add(1d); //nao funciona pq é imutável
//        System.out.println(notas);


        System.out.println("Crie uma liste e adicione as sete notas");

        List<Double> notas = new ArrayList<Double>();
        notas.add(0, 8d);
        notas.add(7d);
        notas.add(10d);
        notas.add(9d);
        notas.add(12d);
        System.out.println(notas);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 7.0: "+ notas.indexOf(7d));

        System.out.println("Adiciona na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);


        System.out.println("Substittua a nota 5 pela nota 7: ");
        notas.set(notas.indexOf(5d), 4.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5 está na lista: "+ notas.contains(5d));


        System.out.println("Exiba todas as notas na ordem em que foram adicionadas: ");
        for (Double nota: notas) {
            System.out.println(nota);
        }


        System.out.println("Exiba a terceira nota adicionada: "+ notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exibba a menor nota: "+ Collections.min(notas));

        System.out.println("Exibba a maior nota: "+ Collections.max(notas));

        System.out.println("Exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Soma dos valores: "+ soma);

        System.out.println("exiba a média das notas: "+ (soma/notas.size()));

        System.out.println("remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("remova a nota na posição 0");
        notas.remove(0);
        System.out.println(notas);


        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.listIterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a kusta está vazia: "+ notas.isEmpty());




    }
}
