package mapMetodos;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("\nCrie um dicionário que relacione os modelos e seus respectivos Consumos");

        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("hb20", 14.4);
            put("mobi", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println("carrosPopulares.toString() = " + carrosPopulares.toString());



        System.out.println("\nSubstitua o consumo do gol por 15.2 Km/L: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println("carrosPopulares.toString() = " + carrosPopulares.toString());



        System.out.println("\nConfira se o modelo tucson está no dicionário: "+ carrosPopulares.containsKey("tucson"));



        System.out.println("\nExiba o consumo do uno: "+ carrosPopulares.get("uno"));



        System.out.println("\nExiba o terceiro modelo adicionado: faalse");
        // com o set não há um métoodo que possa fazer esta busca.



        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println("modelos = " + modelos);



        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println("consumos = " + consumos);



        System.out.println("\nexiba os modelos mais eficientes: ");
        
        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

        for (Map.Entry<String, Double> entry: entries) {
            if (entry.getValue().equals(consumoMaisEficiente)){
                modeloMaisEficiente = entry.getKey();
                System.out.println("modeloMaisEficiente +\" = \"+ consumoMaisEficiente = " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }



        System.out.println("\nExiba o modelo menos eficiente e seu consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries1 = carrosPopulares.entrySet();
        String modeloMenosEficiente = "";

        for (Map.Entry<String, Double> entry : entries1) {
            if (entry.getValue().equals(consumoMenosEficiente)){
                modeloMenosEficiente = entry.getKey();
                System.out.println("modeloMenosEficiente = " + modeloMenosEficiente +" - "+ consumoMenosEficiente);
            }
        }



        System.out.println("\nExiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();

        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("soma = " + soma);


        System.out.println("\nExiba a media de consumo deste dicionário de carros: ");
        System.out.println("media = " + soma/carrosPopulares.size());


        System.out.println("\nRemova os modelos com connsumos iguais a 15.6: ");

        System.out.println("Antes - carrosPopulares = " + carrosPopulares);Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next().equals(15.6))
                iterator1.remove();
        }
        System.out.println("Depois - carrosPopulares = " + carrosPopulares);


        System.out.println("\nExiba todos os  carros na ordem em que foram informados: ");
        System.out.println("carrosPopulares = " + carrosPopulares);

        Map<String, Double> carrosPopulares0 = new LinkedHashMap<>(carrosPopulares);
        System.out.println("carrosPopulares0 = " + carrosPopulares0);

        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("hb20", 14.4);
            put("mobi", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println("carrosPopulares1 = " + carrosPopulares1);



        System.out.println("\nExiba o dicionário ordenado peplo modelo");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares);
        System.out.println("carrosPopulares2 = " + carrosPopulares2);

        Map<String, Double> carrosPopulares02 = new TreeMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("hb20", 14.4);
            put("mobi", 16.1);
            put("kwid", 15.6);
        }};
        System.out.println("carrosPopulares02 = " + carrosPopulares02);


        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();


        System.out.println("\nConfira se o dicionário está vazio: "+ carrosPopulares.isEmpty());

    }
}
