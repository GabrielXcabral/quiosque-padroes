package Model;

import Interface.StateQuiosque;
import States.EmEspera;

public class Quiosque {

    private StateQuiosque EstadoAtual;
    private Aluno Aluno;


    public Quiosque(Aluno aluno) {
        EstadoAtual = new EmEspera();
        Aluno = aluno;
    }

    public void setEstadoAtual(StateQuiosque estadoAtual) {
        EstadoAtual = estadoAtual;
    }

    public Aluno getAluno(){
        return Aluno;
    }

    public StateQuiosque getEstadoAtual() {
        return EstadoAtual;
    }
}
