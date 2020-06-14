package atividadeslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.LinkedList;

public class ProvaLAAQ1 {

    static String caminho = "File1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        int vertices = numeroVertices();
        LinkedList listas[] = new LinkedList[vertices];
        carregarGrafo(listas);
        imprimirGrafo(listas);
        System.out.printf("A complexidade do grafo é: %d",complexidadeGrafo(listas, vertices));
        System.out.println("");
    }

    public static int numeroVertices() throws FileNotFoundException {
        int contador = 0;
        Scanner input = new Scanner(new FileReader(caminho));
        while (input.hasNextLine()) {
            input.nextLine();
            contador++;
        }
        return contador;
    }

    public static void ligarGrafo(LinkedList[] listas) {
        for (int i = 0; i < listas.length; i++) {
            listas[i] = new LinkedList();
        }
    }

    public static void carregarGrafo(LinkedList listas[]) throws FileNotFoundException {
        ligarGrafo(listas);
        Scanner input = new Scanner(new FileReader(caminho));
        int contador = 0;
        while (input.hasNextLine()) {
            String line = input.nextLine();
            String vertices[] = line.split("\t");
            for (String vertice : vertices) {
                listas[contador].add(vertice);
            }
            contador++;
        }
    }

    public static void imprimirGrafo(LinkedList listas[]) throws FileNotFoundException {
        for (int i = 0; i < listas.length; i++) {
            System.out.print(listas[i].get(0) + ": ");
            for (int j = 0; j < listas[i].size() - 1; j++) {
                System.out.print(listas[i].get(j + 1) + " ");
            }
            System.out.printf("(quantidade de vertices adjacentes: %d)", (listas[i].size() - 1));
            System.out.println("");
        }
    }

    public static int complexidadeGrafo(LinkedList listas[],int vertices) {
        int complexidade = 0;
        for (int i = 0; i < listas.length; i++) {
            complexidade += listas[i].size()-1;
        }
        return complexidade + vertices;
    }
}
