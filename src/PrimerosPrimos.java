import java.util.Scanner;

public class PrimerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar numero maximo para calcular primos : ");
        int n = sc.nextInt();
        int countStop = 0;
        int i=2;
        while (countStop<n) {
            if (esPrimo(i)) {
                countStop++;
                System.out.println(i);
            }
            i++;
        }
    }
    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return  false;
        }
        return true;
    }
}