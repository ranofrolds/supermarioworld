package grafo;
import java.util.*;

public class Adjacente {
    int[][] matrizAdj;
    LinkedList<Integer>[] listaAdj;
    
    public Adjacente(int n, int[][] matrizAdj){
        this.matrizAdj= matrizAdj;

        listaAdj=new LinkedList[n];
        for(int i=0;i<n;i++){
            listaAdj[i]=new LinkedList<Integer>();
        }
    }

    public void adicionarAdjacente(int i, int j){
        listaAdj[i].add(j);
    } 

    public LinkedList<Integer>[] getListaAdj(){

        return this.listaAdj;
    }
}
