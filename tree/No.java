package tree;

import java.util.ArrayList;

public class No{
    int n;
    No anterior;
    ArrayList<No> filhos;

    public No(int n){
        this.n=n;
        filhos = new ArrayList<No>();
    }

    public void addFilho(No filho){
        filhos.add(filho);
    }

    public int getN(){
        return this.n;
    }

    public void setAnterior(No anterior){
        this.anterior = anterior;
    }

    public ArrayList<No> getFilhos(){
        return this.filhos;
    }

    public No getAnterior(){
        return this.anterior;
    }
}