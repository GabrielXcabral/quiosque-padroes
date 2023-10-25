package Interface;

import Model.Cartao;
import Model.Quiosque;

public interface StateQuiosque {

    void identificaraluno (Quiosque quiosque);
    void identificarcurso(Quiosque quiosque);
    void processandopagamento(Quiosque quiosque, String numero) throws Exception;
    void emitirnotafiscal (Quiosque quiosque);

    void reiniciarestado(Quiosque quiosque);
}
