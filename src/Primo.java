import javax.print.DocFlavor;
import java.util.Locale;
import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.println("ingresar numero a calcular : ");
            int n = sc.nextInt();
            if (esPrimo(n)) {
                System.out.println("es primo");
            } else {
                System.out.println("No es primo");
            }
    }

    public static boolean esPrimo(int n) {
        if (n==0 || n==1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}