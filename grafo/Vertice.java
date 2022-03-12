package grafo;

public class Vertice {

    int valor;
    int tempoInicial;
    int tempoFinal;
    String cor;
    Vertice pai;


    public Vertice(int n) {
        this.valor = n;
        this.cor="branco";
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

}
