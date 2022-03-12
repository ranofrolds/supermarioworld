package grafo;

public class Grafo {
    Vertice vertices[];
    Adjacente adj;
    int numVet;

    public Grafo(int n, int[][] matAdj) {
        this.numVet = n;
        this.adj = new Adjacente(this.numVet, matAdj);

        this.vertices = new Vertice[n];
        for (int i = 0; i < this.numVet; i++) {
            vertices[i] = new Vertice(i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matAdj[i][j] == 1) {
                    adj.adicionarAdjacente(i, j);
                }
            }
        }
    }



    public Adjacente getAdj() {
        return this.adj;
    }

    public Vertice[] getVertice() {
        return this.vertices;
    }

}
