package Beans;

import Utils.EnumEstadoCore;
import Utils.Util;

public class Core {

    private Processo processo;
    private int idCore;
    private EnumEstadoCore estado;

    public Core() {

        this.idCore = Util.noc;Util.noc++;
        this.estado = EnumEstadoCore.LIVRE;
    }
}
