package grafo;
import java.util.ArrayList;

public class Vertice {
    int valor;
    int grauSaida;
    int grauEntrada;
    int grauTotal;
    ArrayList<Aresta> arestas;

    public Vertice(int n){
        this.valor=n;
        arestas = new ArrayList<Aresta>();
    }

    public void novaAresta(Vertice u, Vertice v){
        Aresta nova = new Aresta(u, v);
        arestas.add(nova);
        grauSaida++;
        grauTotal++;
        v.grauEntrada++;
        v.grauTotal++;
    }
    
}
