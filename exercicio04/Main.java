package exercicio04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        List<String> linhasDesembaralhadas = new ArrayList<>();

        System.out.println("Digite o número de linhas a serem desembaralhadas:");
        int n = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite a linha a ser desembaralhada:");
            String linha = ler.nextLine();
            linhasDesembaralhadas.add(desembaralhar(linha));
        }

        System.out.println("Linhas desembaralhadas:");
        for (String linha : linhasDesembaralhadas) {
            System.out.println(linha);
        }
    }

    public static String desembaralhar(String linha) {
        int metade = linha.length() / 2;
        String primeiraMetade = new StringBuilder(linha.substring(0, metade)).reverse().toString();
        String segundaMetade = new StringBuilder(linha.substring(metade)).reverse().toString();
        return primeiraMetade + segundaMetade;
    }
}
