package exercicio_2;

public class _2TiposDeDados {

    public static void main(String[] args) {
         // Inteiro
            byte b2 = -128; // - tamanho = 8 bits
            byte b1 = 127; // - tamanho = 8 bits

            short s1 = -32768; // - tamanho = 16 bits
            short s2 = 32767; // - tamanho = 16 bits

            int i1 = -2147483648; // - tamanho = 32 bits
            int i2 = 2147483647; // - tamanho = 32 bits

            long l1= -9223372036854775808L; // - tamanho = 64 bits
            long l2= 9223372036854775807L; // - tamanho = 64 bits


         // PONTO FLUTUANTE
          float f1 = -1.4024E-37f; // - tamanho = 32 bits
          float f2 = 3.40282347E+38f; // - tamanho = 32 bits

          double d1 = -4.94E-307; // - tamanho = 64 bits
          double d2 = 1.79769313486231570E308D; // - tamanho = 64 bits



         // CARACTERE - tamanho = 16 bits
            char c1 = 0;
            char c2 = 65535;


         // BOOLEANO - tamanho = 1 bit
            boolean boo1 = false;
            boolean boo2 = true;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("boo1 = " + boo1);
        System.out.println("boo2 = " + boo2);
    }
}
