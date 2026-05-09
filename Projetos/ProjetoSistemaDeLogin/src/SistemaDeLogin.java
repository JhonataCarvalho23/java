import java.util.Scanner;

public class SistemaDeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuarioCorreto = "admin";
        String senhaCorreta = "1234";

        int tentativas = 3;

        while (tentativas > 0){

            System.out.println("\n--- SISTEMA DE LOGIN");

            System.out.println("\nUsuário:");
            String usuario = sc.nextLine();

            System.out.println("Senha:");
            String senha = sc.nextLine();

            if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)){
                System.out.println("\nLogin realizado com sucesso!");

                int opcao;

                do {
                    System.out.println("\n--- MENU ---");
                    System.out.println("\n1- Ver perfil");
                    System.out.println("2- Alterar senha");
                    System.out.println("3- Sair");

                    System.out.println("\nEscolha uma opção:");
                    opcao = sc.nextInt();
                    sc.nextLine();

                    switch (opcao){
                        case 1:
                            System.out.println("\nUsuário: " + usuarioCorreto);
                            break;

                        case 2:
                            System.out.println("\nDigite a nova senha:");
                            senhaCorreta = sc.nextLine();

                            System.out.println("Senha alterada com sucesso!");
                            break;

                        case 3:
                            System.out.println("\nEncerrando programa...");
                            System.out.println("Progama encerrado!");
                            break;

                        default:
                            System.out.println("\nOpção inválida!");
                    }
                } while (opcao != 3);
                break;
            } else {
                tentativas--;

                System.out.println("\nUsuário ou senha incorretos!");

                if (tentativas > 0){
                    System.out.println("Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Conta bloqueada!");
                }
            }
        }
        sc.close();
    }
}