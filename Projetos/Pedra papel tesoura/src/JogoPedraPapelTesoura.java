import java.util.Scanner;
import java.util.Random;
import java.text.Normalizer;

public class JogoPedraPapelTesoura {
    Scanner sc = new Scanner(System.in);
    
    public void desejaJogar(){
        String opcao;
        System.out.println("\n--- PEDRA PAPEL TESOURA ---");
        System.out.println("\nDeseja jogar pedra papel tesoura, sim ou não?:");
        opcao = sc.nextLine();
        opcao = Normalizer.normalize(opcao.toLowerCase(), Normalizer.Form.NFD)
                      .replaceAll("[^\\p{ASCII}]", "");
        
        if (opcao.equals("sim") || opcao.equals("s")){
            jogar();
            
        } else if (opcao.equals("nao") || opcao.equals("n")){
            System.out.println("\nEncerrando programa...");
            System.out.println("Programa encerrado!");
        }
    }
    
    public void jogar(){
        int escolhaDaMaquina = new Random().nextInt(3);
        // [0] Pedra, [1] Papel, [2] Tesoura
        String escolhaDoJogador;
        
        System.out.println("\nEscolha pedra papel ou tesoura");
        escolhaDoJogador = sc.nextLine();
        escolhaDoJogador = (escolhaDoJogador.toLowerCase());
        
        if (escolhaDaMaquina == 0 && escolhaDoJogador.equals("pedra")){
            System.out.println("\nEmpate!");
            System.out.println("Você escolheu pedra e a máquina também escolheu pedra.");
            desejaJogarNovamente();
            
        } else if (escolhaDaMaquina == 1 && escolhaDoJogador.equals("papel")){
            System.out.println("\nEmpate!");
            System.out.println("Você escolheu papel e a máquina também escolheu papel.");
            desejaJogarNovamente();
        
        } else if (escolhaDaMaquina == 2 && escolhaDoJogador.equals("tesoura")){
            System.out.println("\nEmpate!");
            System.out.println("Você escolheu tesoura e a máquina também escolheu tesoura.");
            desejaJogarNovamente();
        
        } else if (escolhaDaMaquina == 1 && escolhaDoJogador.equals("papel")){
            System.out.println("\nEmpate!");
            System.out.println("Você escolheu papel e a máquina também escolheu papel.");
            desejaJogarNovamente();
        
        } else if (escolhaDaMaquina == 0 && escolhaDoJogador.equals("papel")){
            System.out.println("\nParabéns! Você ganhou.");
            System.out.println("Você escolheu papel e a máquina escolheu pedra.");
            desejaJogarNovamente();

        } else if (escolhaDaMaquina == 1 && escolhaDoJogador.equals("tesoura")){
            System.out.println("\nParabéns! Você ganhou.");
            System.out.println("Você escolheu tesoura e a máquina escolheu papel.");
            desejaJogarNovamente();

        } else if (escolhaDaMaquina == 2 && escolhaDoJogador.equals("pedra")){
            System.out.println("\nParabéns! Você ganhou.");
            System.out.println("Você escolheu pedra e a máquina escolheu tesoura.");
            desejaJogarNovamente();

        } else if (escolhaDaMaquina == 0 && escolhaDoJogador.equals("tesoura")){
            System.out.println("\nVocê perdeu!");
            System.out.println("Você escolheu tesoura e a máquina escolheu pedra.");
            desejaJogarNovamente();

        } else if (escolhaDaMaquina == 1 && escolhaDoJogador.equals("pedra")){
            System.out.println("\nVocê perdeu!");
            System.out.println("Você escolheu pedra e a máquina escolheu papel.");
            desejaJogarNovamente();

        } else if (escolhaDaMaquina == 2 && escolhaDoJogador.equals("papel")){
            System.out.println("\nVocê perdeu!");
            System.out.println("Você escolheu papel e a máquina escolheu tesoura.");
            desejaJogarNovamente();

        } else {
            System.out.println("\nOpção inválida!");
            desejaJogarNovamente();
            
        }
    }

    public void desejaJogarNovamente(){
        String opcao;
        System.out.println("\nDeseja jogar novamente, sim ou não?:");
        opcao = sc.nextLine();
        opcao = Normalizer.normalize(opcao.toLowerCase(), Normalizer.Form.NFD)
                      .replaceAll("[^\\p{ASCII}]", "");
        
        if (opcao.equals("sim") || opcao.equals("s")){
            jogar();
            
        } else if (opcao.equals("nao") || opcao.equals("n")){
            System.out.println("\nEncerrando programa...");
            System.out.println("Programa encerrado!");
        }
    }
}