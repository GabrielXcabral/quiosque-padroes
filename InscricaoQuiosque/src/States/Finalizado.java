package States;

import Interface.StateQuiosque;
import Model.Quiosque;

public class Finalizado implements StateQuiosque {
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

    }

    @Override
    public void reiniciarestado(Quiosque quiosque) {
        System.out.println("Estado finalizado, foi reiniciado!");
        quiosque.setEstadoAtual(new EmEspera());
    }

}
