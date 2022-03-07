package algoritmos;
import java.util.*;

public class BuscaEmLargura {
    public BuscaEmLargura(int origem, int n, LinkedList<Integer>[] listaAdj){
        boolean conhecido[] = new boolean[n];
        
        Queue<Integer> fila = new LinkedList<>();
        conhecido[origem]=true;
        fila.add(origem);

        int vertice;

        while(!fila.isEmpty()){
            vertice = fila.poll();
            Iterator<Integer> i = listaAdj[vertice].listIterator();
            while(i.hasNext()){
                int prox = i.next();
                if(!conhecido[prox]){
                    conhecido[prox] = true;
                    fila.add(prox);
                }

            }
            System.out.println();
        }
    }        
}


