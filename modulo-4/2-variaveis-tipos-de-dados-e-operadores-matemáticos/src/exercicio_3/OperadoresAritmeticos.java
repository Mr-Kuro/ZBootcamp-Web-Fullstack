package exercicio_3;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i =10;
        int j=20;
        int k=30;

        // O    rdem de precedência.

        int a = i++ + --j * k; // 10 + 19 * 30 -> 580 - e após isso: i -> 11
        System.out.println("a = i++ + --j * k  --> " + a);

        int c = 2;

        if (i != 0){
            if (i >= 11){
                i -= 1;
            } else if (i < 10) {
                i = 10;
            }
        }

        c *= i += 5;
        System.out.println("c *= i += 5  --> " + c);
    }
}
