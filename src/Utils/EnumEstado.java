package Utils;

public enum EnumEstado {
    PRONTO(0),EXECUTANDO(1),ESPERANDO(2),ABORTADO(3),FINALIZADO(4);

    private int valor;

    EnumEstado(int valor) {
        this.valor = valor;
    }
}
