package algoritmos;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import tree.*;

public class MenorCaminho {
    Arvore tree;

    public MenorCaminho(Arvore tree){
        this.tree=tree;
    }

    public ArrayList<Integer> calcular(int origem, int n) throws IOException{
        ArrayList<Integer> path=new ArrayList<>();
        
        
        No aux=tree.findNo(tree.getverticeIncial(origem), n);
        tree.getverticeIncial(origem).setAnterior(null);

        No anterior=aux.getAnterior();
        path.add(aux.getN());

        while(anterior!=null){
            path.add(anterior.getN());
            anterior=anterior.getAnterior();
        }
        
        Collections.reverse(path);
        return path;
    }
}
