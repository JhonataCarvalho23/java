import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("\n--- TABUADA ---");
        System.out.println("\nDigite um número para saber a tabuada do 1 ao 10:");
        int numero = leitor.nextInt();

        for (int i = 0; i < 11; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
