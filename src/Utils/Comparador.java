package Utils;


import Beans.Processo;
import Controllers.ControllerProcessoSJF;

import java.util.ArrayList;
@Deprecated
public class Comparador {

    public  ArrayList ordena(ArrayList<ControllerProcessoSJF> arrayList){

        for(int i = 0; i<arrayList.size(); i++){
            for(int j = 0; j<arrayList.size()-1; j++){
                if(compara(arrayList.get(j).processo,arrayList.get(j+1).processo)==1){
                    System.out.println("");
                    ControllerProcessoSJF controllerProcessoSJF;
                    controllerProcessoSJF = arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1, controllerProcessoSJF);



                }
            }
        }
    return null;
    }
    public int compara(Processo o, Processo u){

        if (o.getTempoExecucaoTotal()<u.getTempoExecucaoTotal()){
            return 0;
        }else return 1;
    }
}
