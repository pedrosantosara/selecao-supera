package exercicio01;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numeroDigitado = ler.nextInt();

        
        if (numeroDigitado <= 1 || numeroDigitado > 105) {
            System.out.println("o numero digitado está fora do intervalo permitido (1 < N <= 105)");
            return;
        }
        
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
        
        for(int i = 0; i < numeroDigitado; i++) {
            int num = ler.nextInt();
            if(num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
        
        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());
        
        for(int num : pares) {
            System.out.println(num);
        }
        
        for(int num : impares) {
            System.out.println(num);
        }
    }
}
