public class Vertice {
    int valor;
    int grauSaida;
    int grauEntrada;
    int grauTotal;
    Aresta arestas[];

    public Vertice(int n){
        this.valor=n;
    }

    public void novaAresta(Vertice u, Vertice v){
        arestas[grauTotal]=new Aresta(u, v);
        grauSaida++;
        grauTotal++;
        v.grauEntrada++;
        v.grauTotal++;
    }
    
}
