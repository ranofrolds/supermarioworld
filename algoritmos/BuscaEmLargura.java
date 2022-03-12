package algoritmos;
import java.util.*;

import tree.Arvore;
import tree.No;

public class BuscaEmLargura {
    int origem;
    int n;
    LinkedList<Integer>[] listaAdj;
    boolean conhecido[];

    public BuscaEmLargura(int origem, int n, LinkedList<Integer>[] listaAdj){
        this.origem=origem;
        this.n=n;
        this.listaAdj=listaAdj;
        conhecido = new boolean[n];
    }

    public void bfs(Arvore tree){
        Queue<Integer> fila = new LinkedList<>();
        Queue<No> filaTree = new LinkedList<No>();
        conhecido[origem]=true;
        fila.add(origem);

        No vtx;
        No aux;
        No next;
        vtx = new No(origem);
        tree.setverticeIncial(vtx, vtx.getN());
        filaTree.add(tree.getverticeIncial(vtx.getN()));

        int vertice;

        while(!fila.isEmpty()){
            vertice = fila.poll();
            aux=filaTree.poll();

            Iterator<Integer> i = listaAdj[vertice].listIterator();
            while(i.hasNext()){
                int prox = i.next();
                if(!conhecido[prox]){
                    conhecido[prox] = true;
                    fila.add(prox);
                    next= new No(prox);
                    filaTree.add(next);
                    next.setAnterior(aux);
                    aux.addFilho(next);
                }

            }

        }
    }        
}


