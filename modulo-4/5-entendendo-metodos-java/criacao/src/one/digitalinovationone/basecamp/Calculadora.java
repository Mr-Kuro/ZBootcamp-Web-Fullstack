package one.digitalinovationone.basecamp;

import java.util.Objects;
import java.util.Scanner;
    

public class Calculadora {

    public static void soma(double numero1, double numero2) {

        double resultado = numero1 + numero2;
        
        System.out.println("soma: "+ numero1 +" + "+ numero2 +" = "+ resultado +"");
    }

    public static void subtracao(double numero1, double numero2) {

        double resultado = numero1 - numero2;
        
        System.out.println("  subtracao: "+ numero1 +" - "+ numero2 +" = "+ resultado +"");
    }

    public static void divisao(double numero1, double numero2) {

        double resultado = numero1 / numero2;
        
        System.out.println("    divisao: "+ numero1 +" / "+ numero2 +" = "+ resultado +"");
    }

    public static void multiplicacao(double numero1, double numero2) {

        double resultado = numero1 * numero2;

        System.out.println("      multiplicação de "+ numero1 +" * "+ numero2 +" = "+ resultado +"\n");
    }

}


class Scan {
    private Scanner scan = new Scanner(System.in);

    public void Scan(){

    }

    public double[] scanear(){
        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scan.nextDouble();

        double[] numeros = {numero1, numero2};

        return numeros;
    }
    
}
    
    
class Loop {
    private Scanner scan = new Scanner(System.in);

    public void Loop() {

    }

    public String dolOOP(){
        
        System.out.println("Deseja fazer mais calculos?: ");
        String loop = scan.next();

        return loop;
    }
}



class Tela{
    private String loop;

    public void Tela() {
        this.loop = "s";

        print();
    }

    public void print() {
        do {
            double[] numeros = new Scan().scanear();

            Calculadora.soma(numeros[0], numeros[1]);
            Calculadora.subtracao(numeros[0], numeros[1]);
            Calculadora.divisao(numeros[0], numeros[1]);
            Calculadora.multiplicacao(numeros[0], numeros[1]);

            this.loop = new Loop().dolOOP();
            System.out.println(this.loop);
        } while(Objects.equals(this.loop, "s") | Objects.equals(this.loop, "S"));

        System.out.println("obrigado por fazer cauculos conosco!");
    }
}









/*package one.digitalinovationone.basecamp;

import java.util.Scanner;

public class Scan {

    public static double[] numeros() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            double numero1 = scan.nextDouble();

            System.out.println("Digite o segundo número: ");
            double numero2 = scan.nextDouble();

            double numeros[] = {numero1, numero2};

            return numeros;
        }
    }
    

public static String loop() {

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Deseja fazer mais calculos?: ");
            String loop = scan.next();

            return loop;
        }
    }
    
}
*/