package Model;

public class Cartao {
    //private Aluno Aluno;
    private String Numero;
    private int Saldo;

    private boolean SaldoSuficiente = false;
    public Cartao(String numero, int saldo){
        Numero = numero;
        Saldo = saldo;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        Numero = numero;
    }

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int saldo) {
        Saldo = saldo;
    }

    public boolean getSaldoSuficiente() {
        return SaldoSuficiente;
    }

    public void setSaldoSuficiente(boolean saldoSuficiente) {
        SaldoSuficiente = saldoSuficiente;
    }

}
