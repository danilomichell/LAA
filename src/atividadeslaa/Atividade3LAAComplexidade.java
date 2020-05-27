package atividadeslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Atividade3LAAComplexidade {

    static int numeroLinhas = 30000;

    public static void main(String[] args) {
        Scanner in;
        //Os vertices de saída foram salvos em uma estrutura(numb) de dados e os de entrada em outro(listas) 
        LinkedList[] listas = new LinkedList[numeroLinhas];
        String[] numb = new String[numeroLinhas];
        int indice = 0;
        ligarListas(listas);
        try {
            in = new Scanner(new FileReader("grafo-25000.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String array[] = line.split("\t");
                numb[indice] = array[0];
                for (int i = 1; i < array.length; i++) {
                    listas[indice].add(array[i]);
                }
                indice++;
            }
            int numeroVertices = numeroVerticesTotais(numb);
            
            //print(listas, numb);
            
            complexidade(listas,numeroVertices);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void ligarListas(LinkedList[] listas) {
        for (int i = 0; i < numeroLinhas; i++) {
            listas[i] = new LinkedList();
        }
    }

    static int numeroVerticesTotais(String[] listas) {
        int vertices = 0;
        for (int i = 0; i < listas.length; i++) {
            vertices ++;
        }
        System.out.println("O grafo possui " + vertices + " vértices de saída");
        return  vertices;
    }

    static void print(LinkedList[] listas, String numb[]) {
        for (int i = 0; i < numeroLinhas; i++) {
            System.out.println(numb[i] + " tem " + listas[i].size() + " vértices adjacentes");
            System.out.println();
        }
    }

    static void complexidade(LinkedList[] listas,int numeroVertices) {
        int complexidade = 0;
        for (int i = 0; i < numeroLinhas; i++) {
            /*listas[i].size() são os números de arestas pois os 
            vétices de entrada(LinkedList) são formam uma aresta cada com os de saída(numb)*/
            complexidade += listas[i].size();
        }
        complexidade += numeroVertices;
        System.out.println("O grafo possui complexidade " + complexidade);
    }
}
