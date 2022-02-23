public class Grafo {
    Vertice vertices[];
    Adjacente adj;
    int numVet;

    public Grafo(int n, int[][] matAdj){
        this.numVet=n;
        this.adj=new Adjacente(this.numVet, matAdj);

        this.vertices=new Vertice[n];
        for(int i=0; i<this.numVet;i++){
            vertices[i]= new Vertice(i);
        }

        for(int i=0; i<n;i++){
            for(int j=0; i<n; i++){
                if(matAdj[i][j]==1){
                    adicionarArestas(i, j);
                }
            }
        }
    }

    public void adicionarArestas(int u, int v){
        Vertice vertV=vertices[v];
        vertices[u].novaAresta(vertices[u], vertV);
        // adj.matrizAdj[u][v]=1;
    }

    
}
