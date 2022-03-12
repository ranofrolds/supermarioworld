package tree;

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

    public No findNo(No no, int n){
        No aux=null;
        for (No filho : no.getFilhos()) {
            
            if(filho.getN()== n){
                aux=filho;
                return aux;
            }
            
            aux=findNo(filho, n);
            if(aux!=null){
                break;
            }
        }
        return aux;
    }

}
