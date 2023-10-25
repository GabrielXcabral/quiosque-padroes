package States;

import Interface.StateQuiosque;
import Model.Cartao;
import Model.Quiosque;

public class Processando implements StateQuiosque {
    private int valordocurso = 50;

    @Override
    public void identificaraluno(Quiosque quiosque) {
        System.out.println("Aluno valido!");
    }

    @Override
    public void identificarcurso(Quiosque quiosque) {
        System.out.println("Curso valido!");
    }

    @Override
    public void processandopagamento(Quiosque quiosque, String numero) throws Exception {
        //try {
            Cartao cartao = quiosque.getAluno().getCartao(numero);
            if (cartao != null) {
                if (cartao.getSaldo() >= valordocurso) {
                    System.out.println("Pagamento aprovado\n");
                    cartao.setSaldoSuficiente(true);
                    quiosque.setEstadoAtual(new Inscrito());
                } else {
                    System.out.println("Saldo insuficiente\n");
                }
            }else{
                throw new Exception("Cartão invalido, tente novamente\n");
            }
    }

    @Override
    public void emitirnotafiscal (Quiosque quiosque){

    }

    @Override
    public void reiniciarestado (Quiosque quiosque){
        System.out.println("Estado não foi finalizado!");
    }
}
