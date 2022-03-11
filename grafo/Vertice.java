package grafo;

import java.util.ArrayList;

public class Vertice {

    int valor;
    int grauSaida;
    int grauEntrada;
    int grauTotal;
    int tempoInicial;
    int tempoFinal;
    String cor;
    Vertice pai;

    ArrayList<Aresta> arestas;

    public Vertice(int n) {
        this.valor = n;
        this.cor="branco";
        arestas = new ArrayList<Aresta>();
    }

    public void setTempoInicial(int tempo) {
        this.tempoInicial = tempo;
    }

    public void setTempoFinal(int tempo) {
        this.tempoFinal = tempo;
    }

    public int getValor() {
        return valor;
    }

    public String getCor() {
        return this.cor;
    }

    public void setPai(Vertice v) {
        this.pai = v;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void novaAresta(Vertice u, Vertice v) {
        Aresta nova = new Aresta(u, v);
        arestas.add(nova);
        grauSaida++;
        grauTotal++;
        v.grauEntrada++;
        v.grauTotal++;
    }

}
