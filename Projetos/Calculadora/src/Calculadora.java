import java.util.Scanner;

public class Calculadora {
    Scanner sc = new Scanner(System.in);

    int numero1;
    int numero2;

    public void calcular(){
        System.out.println("\n--- CALCULADORA ---");

        int opcao = 0;

        while (opcao < 5){
            System.out.println("\nDigite o primeiro número:");
            numero1 = sc.nextInt();

            System.out.println("Digite o segundo número:");
            numero2 = sc.nextInt();

            System.out.println("\nO que você deseja fazer:");
            System.out.println("\n1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Dividir");
            System.out.println("4- Multiplicar");
            System.out.println("5- Sair");

            opcao = sc.nextInt();

            if (opcao == 1){
                somar();

            } else if (opcao == 2){
                subtrair();
            } else if (opcao == 3){
                dividir();
            } else if (opcao == 4){
                multiplicar();
            } else {
                System.out.println("\nEncerrando progrma...");
                System.out.println("Programa encerrado!");
            }
         }
    }

    public void somar(){
        int resultado = numero1 + numero2;
        System.out.println("\n" + numero1 + " + " + numero2 + " = " + resultado);
    }

    public void subtrair(){
        int resultado = numero1 - numero2;
        System.out.println("\n" + numero1 + " - " + numero2 + " = " + resultado);
    }

    public void dividir(){
        int resultado = numero1 / numero2;
        System.out.println("\n" + numero1 + " dividido por " + numero2 + " = " + resultado);
    }

    public void multiplicar(){
        int resultado = numero1 * numero2;
        System.out.println("\n" + numero1 + " x " + numero2 + " = " + resultado);
    }
}