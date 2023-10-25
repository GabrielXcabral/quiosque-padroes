package States;

import Interface.StateQuiosque;
import Model.Cartao;
import Model.Quiosque;

public class Identificando implements StateQuiosque {
    private String[] cursos = {"GPT","BLOCKCHAIN","IOT","VR"};


    @Override
    public void identificaraluno(Quiosque quiosque) {
        System.out.println("Aluno validado!");
    }

    @Override
    public void identificarcurso(Quiosque quiosque) {
        if(validar(quiosque)){
            quiosque.setEstadoAtual(new Processando());
            System.out.println("Curso valido!\n");
        }else{
            System.out.println("Curso Escolhido não existe!\n");
        }

    }


    public boolean validar(Quiosque quiosque){
        for(String curso : cursos){
            if (curso.equals(quiosque.getAluno().getCurso().toUpperCase())){
                quiosque.getAluno().setMinicursovalido(true);
                return  true;
            }
        }
        return false;

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
}
