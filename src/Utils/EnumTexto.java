package Utils;

public enum EnumTexto {
    ID("id:"),TOTAL_TEMPO("total:"),ESTADO("estado:"),DEADLINE("deadline:");
    private String campo;

    public String getCampo(){
        return campo;
    }
    EnumTexto(String campo) {
        this.campo = campo;
    }
}
