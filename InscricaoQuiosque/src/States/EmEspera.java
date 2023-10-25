package States;

import Interface.StateQuiosque;
import Model.Aluno;
import Model.Cartao;
import Model.Quiosque;

public class EmEspera implements StateQuiosque {
    private boolean validar = false;

    @Override
    public void identificaraluno(Quiosque quiosque) {
        if (validar(quiosque)){
            quiosque.setEstadoAtual(new Identificando());
            System.out.println("Aluno Matriculado\n");
        }else{
            System.out.println("Matricula Invalida\n");
        }
    }


    public boolean validar(Quiosque quiosque) {
        //Só ver se a matricula tem 7 digitos, se tiver é uma matricula valida
        if (quiosque.getAluno().getMatricula().matches("\\d{7}")){
            quiosque.getAluno().setAlunomatriculado(true);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void identificarcurso(Quiosque quiosque) {
        System.out.println("Ainda o aluno não foi validado");
    }

    @Override
    public void processandopagamento(Quiosque quiosque, String numero) {
        System.out.println("Esse estagio não permite isso");
    }

    @Override
    public void emitirnotafiscal(Quiosque quiosque) {

    }

    @Override
    public void reiniciarestado(Quiosque quiosque) {
        System.out.println("Estado não foi finalizado!");
    }

    public boolean getValidar(){
        return validar;
    }
}
