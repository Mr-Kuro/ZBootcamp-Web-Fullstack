package one.digitalinovationone.basecamp;

import java.util.Scanner;

public class Mensagem {
    private final int hora = hora();
    public Mensagem(){
        switch ( hora ){
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                mensagemBomDia();
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
        }
    }

    private int hora(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o horário: ");
        int numero = scan.nextInt();
        return numero;
    }

    private void mensagemBomDia() {
        System.out.println("Bom dia");
    }

    private void mensagemBoaTarde() {
        System.out.println("Boa tarde");

    }

    private void mensagemBoaNoite() {
        System.out.println("Boa noite");

    }
}
