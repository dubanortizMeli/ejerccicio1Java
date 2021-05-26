import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        int entrada=0, count=0, i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("cuentos numeros pares desea ver : ");
        entrada = sc.nextInt();
        while (count<entrada){
            if(i%2==0){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}