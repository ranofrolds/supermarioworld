package algoritmos;

import java.util.*;

import grafo.*;
import tree.*;


public class BuscaEmProfundidade {
    int tempo;
    boolean conhecido[];
    Grafo grafo;
    Vertice vertices[];
    boolean arestas[];

    public BuscaEmProfundidade(Grafo G, int n) {
        conhecido = new boolean[n];
        tempo = 0;
        grafo = G;
        vertices=grafo.getVertice();

    }

    public LinkedList<Vertice> BFP(Arvore tree) {
        
        LinkedList<Vertice> topo = new LinkedList<>();
 

        for (Vertice v : grafo.getVertice()) {
            No origem=new No(v.getValor());
            tree.setverticeIncial(origem,origem.getN());
            bfpVisit(v,origem, topo);

        }

        Collections.reverse(topo);

        return topo;
    }

    public void bfpVisit(Vertice v, No no, LinkedList<Vertice> topo ) {
        tempo++;
        v.setTempoInicial(tempo);
        v.setCor("cinza");
        LinkedList<Integer> u[] = grafo.getAdj().getListaAdj();
        for (Integer a : u[v.getValor()]) {
            if (conhecido[a] == false && vertices[a].getCor()=="branco") { 
                    
                    grafo.getVertice()[a].setPai(v);
                    No novo = new No(a);
                    no.addFilho(novo);
                    bfpVisit(grafo.getVertice()[a], novo, topo);
 
            }
        }
        if(conhecido[v.getValor()]==false){
            topo.add(grafo.getVertice()[v.getValor()]);
            conhecido[v.getValor()] = true;
        }
        
        tempo++;
        v.setTempoFinal(tempo);
        v.setCor("preto");
    }

   

}
