package other;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Inputs {
    public void entradaMatriz(Scanner buffer, int[][] matAdj, int N){
        for(int i=0; i<N; i++){
            String aux=buffer.nextLine();
            for(int j=0; j<N; j++){
                matAdj[i][j]=Integer.parseInt(""+aux.charAt(j));
            }
        }
    }


    public void criaArqMatriz(String path, int N) throws IOException{
        FileWriter arq =new FileWriter(path,true);
        BufferedWriter buffer = new BufferedWriter(arq);
        Scanner sc= new Scanner(System.in);
        
        int row[]=new int[N];

        for(int i=0; i<N; i++){
            if(i==0){
                System.out.println("Quantos vertices a YH é ligada?");

            }
            else if(i>0 && i<53){
                System.out.println("Quantos vertices a fase "+i+" é ligada?");
               
            }
            else if(i>52 && i<57){
                System.out.println("Quantos vertices o SwitchPalace "+(i-(i-1))+" é ligada?");
                
            }
            else if(i>56 && i<66){
                System.out.println("Quantos vertices o Castelo "+(i-(i-1))+" é ligada?");
                
            }
            else if(i>65 && i<72){
                System.out.println("Quantos vertices o Ghosthouse "+(i-(i-1))+" é ligada?");
                
            }
            else if(i>71 && i<77){
                System.out.println("Quantos vertices o Fortress "+(i-(i-1))+" é ligada?");
                
            }
            else if(i>77 && i<89){
                System.out.println("Quantos vertices o Cano "+i+" é ligada?");
                
            }     
            else if(i>88 && i<97){
                System.out.println("Quantos vertices a Estrela "+(i)+" é ligada?");
            }
            int j;
            j= sc.nextInt();
            int aux[]=new int[j];
            System.out.println("Digite eles:");
            for(int k=0; k<j; k++){
                aux[k]=sc.nextInt();
                row[aux[k]]=1;
            }
            //printar no arquivo
            for (int k : row) {
                buffer.write(""+k);
            }
            //quebra de linha
            buffer.newLine();
            Arrays.fill(row,0);
        }
        buffer.close();
        arq.close();
        sc.close();
    }
}
