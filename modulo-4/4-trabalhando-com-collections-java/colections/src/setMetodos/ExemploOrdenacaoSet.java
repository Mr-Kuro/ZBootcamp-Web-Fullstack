package setMetodos;

import java.io.Serial;
import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        System.out.println("\n---\tOrdem aleatória\t---");
        Set<Serie> minhaSerie = new HashSet<>(){{
            add(new Serie("AOT", "Seinen", 23));

            add(new Serie("Bleach", "Shounen", 25));

            add(new Serie("Naruto", "Shoune", 5));

            add(new Serie("Golden Time", "Romance", 60));
        }};
        for (Serie serie: minhaSerie) {
            System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpsodio());
        }



        System.out.println("\n---\tOrdem de incerção\t---");
        Set<Serie> minhaSerie1 = new LinkedHashSet<>(){{
            add(new Serie("AOT", "Seinen", 23));

            add(new Serie("Bleach", "Shounen", 25));

            add(new Serie("Naruto", "Shoujo", 25));

            add(new Serie("Golden Time", "Romance", 24));
        }};
        for (Serie serie: minhaSerie) {
            System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpsodio());
        }



        System.out.println("\n---\tOrdem Natural (TempoEpisodio\t---");
        Set<Serie> minhaSerie2 = new TreeSet<>(minhaSerie1);
        for (Serie serie: minhaSerie2) {
            System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpsodio());
        }


        System.out.println("---\tOrdem Nome/Gênero/TempoEpisodio\t---");
        Set<Serie> minhaSerie3 = new TreeSet<>(new CompareToNomeGeneroTempoEpisodio());
        minhaSerie3.addAll(minhaSerie);
        for (Serie serie : minhaSerie3) {
            System.out.println(serie.getNome() +" - "+ serie.getGenero() +" - "+ serie.getTempoEpsodio());
        }



    }
}


class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpsodio;

    public Serie(String nome, String genero, Integer tempoEpsodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpsodio = tempoEpsodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpsodio() {
        return tempoEpsodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", TempoDeEpsodio=" + nome +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpsodio.equals(serie.tempoEpsodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpsodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpsodio(), serie.getTempoEpsodio());
        if (tempoEpisodio != 0) return tempoEpisodio;

        return this.getGenero().compareTo(serie.getGenero());
    }
}

class CompareToNomeGeneroTempoEpisodio implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0) return nome;

        int genero = s1.getTempoEpsodio().compareTo(s2.getTempoEpsodio());
        if (genero != 0) return genero;

        return Integer.compare(s1.getTempoEpsodio(), s2.getTempoEpsodio());
    }
}