import Model.Aluno;
import Model.Cartao;
import Model.Quiosque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String matricula;
        Aluno aluno;
        Quiosque quiosque;
        String cartao = "";
        String curso;
        Cartao cartao1;
        Cartao cartao2;
        Cartao cartao3;

        List<Cartao> cartoes = new ArrayList<>();

        cartao1 = new Cartao("1234567", 100);
        cartao2 = new Cartao("6789101", 40);
        cartao3 = new Cartao("1231415", 1000);

        cartoes.add(cartao1);
        cartoes.add(cartao2);
        cartoes.add(cartao3);


        while (true) {
            // Etapa 1: Solicitar matrícula válida
            do {
                System.out.print("Digite o número de matrícula: ");
                matricula = scanner.nextLine();
                aluno = new Aluno(matricula);
                aluno.setCartoes(cartoes);
                quiosque = new Quiosque(aluno);
                quiosque.getEstadoAtual().identificaraluno(quiosque);
            } while (!quiosque.getAluno().isAlunomatriculado());

            // Etapa 2: Escolher curso
            do {
                System.out.print("Escolha um curso (GPT, BLOCKCHAIN, IOT, VR): ");
                curso = scanner.nextLine();
                quiosque.getAluno().setCurso(curso);
                quiosque.getEstadoAtual().identificarcurso(quiosque);
            } while (!quiosque.getAluno().isMinicursovalido());

            // Etapa 3: Informar cartão de crédito
            do {
                try {
                    System.out.print("Digite o número do cartão de crédito: \n");
                    System.out.print("Números de cartões de crédito que o usuário tem.\n" +
                            "/OBS: (Só para simular)/\n" +
                            "CARTÃO 1 = 1234567 -> Saldo: 100\n" +
                            "CARTÃO 2 = 6789101 -> Saldo: 40]\n" +
                            "CARTÃO 3 = 1231415 -> Saldo: 1000\n");
                    cartao = scanner.nextLine();
                    quiosque.getEstadoAtual().processandopagamento(quiosque, cartao);
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
                while (quiosque.getAluno().getCartao(cartao) == null) {
                    try{
                    System.out.print("Digite o número do cartão de crédito: ");
                    cartao = scanner.nextLine();
                    quiosque.getEstadoAtual().processandopagamento(quiosque, cartao);
                    }catch (Exception e){
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
            } while (!quiosque.getAluno().getCartao(cartao).getSaldoSuficiente());


            // Etapa 4: Emitir nota fiscal
            quiosque.getEstadoAtual().emitirnotafiscal(quiosque);

            // Etapa 5: //reiniciar estado
            quiosque.getEstadoAtual().reiniciarestado(quiosque);

            // Verificar se o usuário deseja encerrar o programa
            System.out.print("Deseja encerrar o programa? (Sim/Não): ");
            String encerrar = scanner.nextLine();
            if (encerrar.equalsIgnoreCase("Sim")) {
                break;
            }
        }
    }
}