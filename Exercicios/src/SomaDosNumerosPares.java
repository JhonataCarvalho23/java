import java.util.Scanner;

public class SomaDosNumerosPares {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n--- SOMA DOS NÚMEROS PARES ---");

        int somaDosPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite O " + (i + 1) + "° número:");
            int numero = sc.nextInt();

            if (numero % 2 == 0){
                somaDosPares += numero;
            }
        }

        System.out.println("\nA soma dos números pares são: " + somaDosPares);
    }
}