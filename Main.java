import java.util.Scanner;

import algoritmos.BuscaEmLargura;
import grafo.Grafo;
import other.Inputs;

import java.io.IOException;
import java.io.File;

/*
0- YH
1-52 Fase Normal
53- 56 Switch Palace
57- 65 Castelos
66- 71 Ghost House
72- 76 Fortress
77- 88 Canos
89- 96 Estrelas
*/

public class Main{
    public static void main(String argc[]) throws IOException{
        int N=3;
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


        // G.adicionarMatrizAdj(matAdj);


        
        sc.close();
    }

   
}