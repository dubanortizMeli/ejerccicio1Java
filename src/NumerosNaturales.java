import java.util.ArrayList;
import java.util.Scanner;

public class NumerosNaturales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de M");
        int m = sc.nextInt();
        System.out.println("Ingrese el valor de N");
        int n = sc.nextInt();
        System.out.println("Ingrese el valor de D");
        int d = sc.nextInt();
        boolean detenerse = false;
        int count = 0;
        int countStop = 0;
        while (!detenerse){
            count++;
            String Number = Integer.toString(count);
            int countExist=0;
            for (int i = 0; i < Number.length(); i++) {

                int a =Character.getNumericValue( Number.charAt(i));
                if (a ==  d){
                    countExist++;
                }
            }

            if (countExist == m){
                System.out.println(Number);
                countStop ++;
            }
            if (countStop == n)
                detenerse = !detenerse;
        }
        sc.close();
    }
}
