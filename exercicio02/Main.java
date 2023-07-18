package exercicio02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numeroDigitado = ler.nextDouble();

        if (numeroDigitado < 0 || numeroDigitado > 1000000.00) {
            System.out.println("O valor inserido está fora do intervalo permitido.");
            return;
        }

        int valor = (int) numeroDigitado;
        int moedas = (int) Math.round((numeroDigitado - valor) * 100);

        int[] notas = {100, 50, 20, 10, 5, 2};
        System.out.println("NOTAS:");
        for (int nota : notas) {
            int quantidadeNotas = valor / nota;
            System.out.println(quantidadeNotas + " nota(s) de R$ " + String.format("%.2f", (double) nota));
            valor -= quantidadeNotas * nota;
        }

        moedas += valor * 100;
        int[] valoresMoedas = {100, 50, 25, 10, 5, 1};
        System.out.println("MOEDAS:");
        for (int moeda : valoresMoedas) {
            int quantidadeMoedas = moedas / moeda;
            System.out.println(quantidadeMoedas + " moeda(s) de R$ " + String.format("%.2f", (double) moeda / 100));
            moedas -= quantidadeMoedas * moeda;
        }
    }
}
