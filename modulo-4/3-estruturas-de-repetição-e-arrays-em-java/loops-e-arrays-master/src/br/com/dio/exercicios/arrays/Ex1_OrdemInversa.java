package br.com.dio.exercicios.arrays;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

/*
public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        //System.out.println(vetor.length);

        System.out.print("Vetor: ");
        int count =0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1); i >= 0; i --) {
            System.out.print(vetor[i] + " ");
        }

    }
}
*/


public class Ex1_OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = {0, -5, 15, 50, 8, 4};

        System.out.println(vetor); //onde ele está alocado no computador
        System.out.println(vetor.length); //tamanhor

        System.out.println("vetor: ");

        int count = 0;
        while ( count <= (vetor.length -1)){
            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("vetor: ");
        for (int i = vetor.length -1; i >= 0; i--) {
            System.out.println(vetor[i] +" ");
        }
    }
}