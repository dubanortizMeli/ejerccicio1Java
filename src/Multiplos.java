import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) {
        int count =1, n=0, m=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingresar numero de veces que quiere ver el multiplo : ");
        n = sc.nextInt();
        System.out.println("Ingresar que multiplo busca : ");
        m = sc.nextInt();

        while (count<=n){
            System.out.println(m*count);
            count++;
        }
        sc.close();
    }
}
