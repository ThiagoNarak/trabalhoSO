package Beans;

import Controllers.ControllerProcessoSJF;
import Utils.EnumEstado;
import Utils.Util;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Random;

public class Processo  extends Thread{
    private IntegerProperty pid;
    private IntegerProperty tempoExecucaoTotal;
    private IntegerProperty tempoRestante;
    private ObjectProperty<EnumEstado> estado;
    private IntegerProperty tempoLimite;
    private ControllerProcessoSJF controllerProcessoSJF;
    private IntegerProperty quantumRestante;

    public Processo() {
        Random random = new Random();
        this.quantumRestante = new SimpleIntegerProperty(0);
        this.pid = new SimpleIntegerProperty(Util.pid);Util.pid++;
        this.tempoExecucaoTotal =new SimpleIntegerProperty(random.nextInt(16)+4) ;
        this.tempoRestante = new SimpleIntegerProperty(tempoExecucaoTotal.get());
        this.estado =  new SimpleObjectProperty<EnumEstado>(EnumEstado.PRONTO) ;
        this.tempoLimite = new SimpleIntegerProperty(random.nextInt(16)+4);

    }


    public ControllerProcessoSJF getControllerProcessoSJF() {
        return controllerProcessoSJF;
    }

    public void setControllerProcessoSJF(ControllerProcessoSJF controllerProcessoSJF) {
        this.controllerProcessoSJF = controllerProcessoSJF;
    }

    public int getPid() {
        return pid.get();
    }

    public IntegerProperty pidProperty() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid.set(pid);
    }

    public int getTempoExecucaoTotal() {
        return tempoExecucaoTotal.get();
    }

    public int getQuantumRestante() {
        return quantumRestante.get();
    }

    public IntegerProperty quantumRestanteProperty() {
        return quantumRestante;
    }

    public void setQuantumRestante(int quantumRestante) {
        this.quantumRestante.set(quantumRestante);
    }

    public IntegerProperty tempoExecucaoTotalProperty() {
        return tempoExecucaoTotal;
    }

    public void setTempoExecucaoTotal(int tempoExecucaoTotal) {
        this.tempoExecucaoTotal.set(tempoExecucaoTotal);
    }

    public int getTempoRestante() {
        return tempoRestante.get();
    }

    public IntegerProperty tempoRestanteProperty() {
        return tempoRestante;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante.set(tempoRestante);
    }

    public EnumEstado getEstado() {
        return estado.get();
    }

    public ObjectProperty<EnumEstado> estadoProperty() {
        return estado;
    }

    public void setEstado(EnumEstado estado) {
        this.estado.set(estado);
    }

    public int getTempoLimite() {
        return tempoLimite.get();
    }

    public IntegerProperty tempoLimiteProperty() {
        return tempoLimite;
    }

    public void setTempoLimite(int tempoLimite) {
        this.tempoLimite.set(tempoLimite);
    }
}
