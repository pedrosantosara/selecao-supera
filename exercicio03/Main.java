package exercicio03;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o tamanho do array e o valor alvo (n k):");
        int n = ler.nextInt();
        int k = ler.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Informe os valores do array:");
        for(int i = 0; i < n; i++){
            arr[i] = ler.nextInt();
        }

        int result = countPairs(arr, k);
        System.out.println("Resultado: " + result);
    }

    public static int countPairs(int[] arr, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : map.keySet()) {
            if (map.containsKey(num + k)) {
                count += map.get(num);
            }
        }

        return count;
    }
}
