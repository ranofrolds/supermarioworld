import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import algoritmos.BuscaEmLargura;
import algoritmos.BuscaEmProfundidade;
import algoritmos.MenorCaminho;
import grafo.*;
import other.Inputs;
import tree.Arvore;

import java.io.IOException;
import java.io.File;

/*
0- YH
1-52 Fase Normal
53- 56 Switch Palace
57- 65 Castelos
66- 71 Ghost House
72- 75 Fortress  
76- 87 Canos : 76->77|78->79|80->81|82->83|84->85|86->87|
88- 94 Estrelas
*/

public class Main{
    public static void main(String argc[]) throws IOException{
        int N=95;
        //CRIAR MATRIZ E PEGAR VALOR*
        int matAdj[][]=new int[N][N];
        Scanner sc=new Scanner(System.in);
        Inputs inpt=new Inputs();
        char aux;
        String path;
        

        System.out.println("Bem vindo!\nJa existe um arquivo de Matriz Adjacente? S/N?");
        aux=sc.nextLine().charAt(0);
        
        if(Character.toLowerCase(aux)=='s'){
            System.out.println("Digite o nome do arquivo");
            path="out/";
            path+=sc.nextLine();
            path+=".txt";

            Scanner buffer = new Scanner(new File(path));


            inpt.entradaMatriz(buffer, matAdj, N);

            buffer.close();
           
        }
        else if(Character.toLowerCase(aux)=='n'){
            System.out.println("Qual nome do arquivo que deseja criar?");
            path="out/";
            path+=sc.nextLine();
            path+=".txt";

            File file=new File(path);
            file.createNewFile();

            inpt.criaArqMatriz(path,N);

            Scanner buffer = new Scanner(new File(path));
            inpt.entradaMatriz(buffer, matAdj, N);

            buffer.close();
            
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print("["+matAdj[i][j]+"]");
            }
            System.out.println();
        }
        Grafo G = new Grafo(N, matAdj);
        BuscaEmLargura bel= new BuscaEmLargura(0, N, (G.getAdj()).getListaAdj());
        Arvore tree= new Arvore(N);
        bel.bfs(tree);
        tree.percorrerArvore(tree.getverticeIncial(0));
        MenorCaminho retorno= new MenorCaminho(tree);
        int fim=18;
        System.out.println("Menor Caminho para "+fim+":");
        ArrayList<Integer> percurso=retorno.calcular(0,fim);

        for (Integer i : percurso) {
            System.out.print(i+"-");
        }

        System.out.println("\n\n\n\n");

        BuscaEmProfundidade bfp = new BuscaEmProfundidade(G, N);
        Arvore tree2=new Arvore(N);
        LinkedList<Vertice> topologia= new LinkedList<>();
        topologia=bfp.BFP(tree2);

        tree2.percorrerArvore(tree2.getverticeIncial(0));
        // G.adicionarMatrizAdj(matAdj);

        System.out.println("\n\n\n\nPrintando Ordem Topologica: ");
        
        for (Vertice vertice : topologia) {
            System.out.print(vertice.getValor()+"-");
        }
        
        sc.close();
    }

   
}