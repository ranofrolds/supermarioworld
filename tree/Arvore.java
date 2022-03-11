package tree;

import java.util.ArrayList;

public class Arvore {

    No verticeIncial[];

    public Arvore(int n){
        verticeIncial=new No[n];
    }

    public No getverticeIncial(int n){
        
        return this.verticeIncial[n];
    }
    public void setverticeIncial(No first, int n){
        verticeIncial[n]= first;
    }

    public void percorrerArvore(No no){
        System.out.println();
        System.out.println("Pai: "+no.getN());
        System.out.print("Filhos: ");
        for (No filho: no.getFilhos()) {
            System.out.print(filho.getN()+"-");
        }
        System.out.println();
        for (No filho : no.getFilhos()) {
            percorrerArvore(filho);
        }
    }
}
