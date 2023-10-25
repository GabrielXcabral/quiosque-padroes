package States;

import Interface.StateQuiosque;
import Model.Quiosque;

public class Inscrito implements StateQuiosque {
    @Override
    public void identificaraluno(Quiosque quiosque) {
        System.out.println("Aluno valido!");
    }

    @Override
    public void identificarcurso(Quiosque quiosque) {
        System.out.println("Curso valido!");
    }

    @Override
    public void processandopagamento(Quiosque quiosque, String numero) {
        System.out.println("Pagamento aprovado");
    }

    @Override
    public void emitirnotafiscal(Quiosque quiosque) {
        System.out.println("O curso: " + quiosque.getAluno().getCurso() + ", foi comprado pelo o aluno de matrucla: " + quiosque.getAluno().getMatricula() + " na loja de CNPJ 50505124\n");
        quiosque.setEstadoAtual(new Finalizado());
    }

    @Override
    public void reiniciarestado(Quiosque quiosque) {
        System.out.println("Processo não foi finalizado!");
    }

}
