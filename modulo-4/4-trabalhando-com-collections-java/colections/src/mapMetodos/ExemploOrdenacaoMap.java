package mapMetodos;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("\n---\tOrdem Aleatória\t---");
        Map<String, Livro> meusLivros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 488));
        }};
        for (Map.Entry<String, Livro> livro :meusLivros.entrySet()){
            System.out.println("livro = "+ livro.getKey() +" - "+ livro.getValue().getNome());
        }


        System.out.println("\n---\tOrdem de incerção\t---");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(meusLivros) {{
            put("Harari, Yuval Noah", new Livro("21 Lições Para o Século 21", 432));
            put("Duhigg, Charles", new Livro("O Poder do Hábito", 488));
            put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet()) {
            System.out.println("livro = "+ livro.getKey() +" - "+ livro.getValue().getNome());
        }

        System.out.println("");

        Map<String, Livro> meusLivros01 = new LinkedHashMap<>(meusLivros);
        for (Map.Entry<String, Livro> livro: meusLivros01.entrySet()) {
            System.out.println("livro = "+ livro.getKey() +" - "+ livro.getValue().getNome());
        }


        System.out.println("\n---\tOrdem alfabetica autores\t---");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro : meusLivros2.entrySet())
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome());


        System.out.println("\n---\tOrdem alfabética nomes dos livros\t---");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        System.out.println("meusLivros3 = " + meusLivros3);
        for (Map.Entry<String, Livro> livro :
                meusLivros3) {
            System.out.println(livro.getKey() +" - "+ livro.getValue().getNome());
        }


        System.out.println("\n---\tOrdenar por número de páginas\t---");



    }
}

class Livro{
    private String nome;
    private Integer pagina;

    public Livro(String nome, Integer pagina) {
        this.nome = nome;
        this.pagina = pagina;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPagina() {
        return pagina;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && pagina.equals(livro.pagina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, pagina);
    }
}


class ComparatorNome implements Comparator<Map.Entry<String, Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());

    }
}