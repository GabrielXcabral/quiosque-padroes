package Model;

import java.util.ArrayList;
import java.util.List;



public class Aluno {
    private String Matricula;
    private String Curso;
    private boolean alunomatriculado = false;
    private  boolean minicursovalido = false;



    private List<Cartao> Cartaos;

    public Aluno (String matricula){
        Matricula = matricula;
        Cartaos = new ArrayList<>();
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public List<Cartao> getCartaos() {
        return Cartaos;
    }

    public Cartao getCartao(String numero) {
        for (Cartao cartao : Cartaos){
            if(cartao.getNumero().equals(numero)){
                return cartao;
            }
        }
        return null;
        //throw new NullPointerException("O cartão com o número " + numero + " não foi encontrado.");

    }

    public void setCartoes(List<Cartao> cartoes) {
        this.Cartaos.addAll(cartoes);
    }

    public boolean isAlunomatriculado() {
        return alunomatriculado;
    }

    public void setAlunomatriculado(boolean alunomatriculado) {
        this.alunomatriculado = alunomatriculado;
    }

    public boolean isMinicursovalido() {
        return minicursovalido;
    }

    public void setMinicursovalido(boolean minicursovalido) {
        this.minicursovalido = minicursovalido;
    }

}
