package Utils;

import Beans.Processo;

import java.util.ArrayList;
@Deprecated
public class Algoritimos {

        public  void insertionSort(ArrayList<Processo> vetor) {
            int j;
            int key;
            int i;
            Processo processo;
            for (j = 1; j < vetor.size(); j++) {
                key = vetor.get(j).getTempoExecucaoTotal();
                processo =  vetor.get(j);
//                key = vetor[j];
                for (i = j - 1; (i >= 0) && (vetor.get(i).getTempoExecucaoTotal() > key); i--) {

                    vetor.set(i+1,vetor.get(i));
//                    vetor[i + 1] = vetor[i];
                }
//                vetor[i + 1] = key;
            }
        }
        private void troca(ArrayList<Processo> vetor,int i,int j){



        }



}
