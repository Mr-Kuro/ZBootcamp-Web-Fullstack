package exercicio_1;

public class _1ConceituacaoECriacao {
    public static void main(String[] args) {
        /* variáveis declaradas do jeito certo*/
        int i;
        int I;
        int _1a;
        int $1a;

        i = 5;
        I = 10;
        _1a = 12; //não recomendado
        $1a = 37; //não recomendado

        final int J = 10; // J  não pode ter o valor mudado

        final int QUANTIDADE_PRODUTo = 50;

        System.out.println("i = " + i);
        System.out.println("I = " + I);
        System.out.println("_1a = " + _1a);
        System.out.println("$1a = " + $1a);
        System.out.println("J = " + J);
        System.out.println("QUANTIDADE_PRODUTo = " + QUANTIDADE_PRODUTo);

        /*Apenas o final pode ser aplicado a variáveis locais de métodos*/ /**/

        System.out.println("\nApenas o final pode ser aplicado a variáveis locais de métodos");
    }
}
