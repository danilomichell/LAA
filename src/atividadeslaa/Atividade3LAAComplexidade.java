package atividadeslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Atividade3LAAComplexidade {

    static int numeroVertice = 30000;

    public static void main(String[] args) {
        Scanner in;
        LinkedList[] listas = new LinkedList[numeroVertice];
        String[] numb = new String[30000];
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
            numeroVerticesTotais(listas);
            print(listas, numb);
            complexidade(listas);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void ligarListas(LinkedList[] listas) {
        for (int i = 0; i < numeroVertice; i++) {
            listas[i] = new LinkedList();
        }
    }

    static void numeroVerticesTotais(LinkedList[] listas) {
        int vertices = 0;
        for (int i = 0; i < numeroVertice; i++) {
            vertices += listas[i].size();
        }
        System.out.println("O grafo possui " + vertices + " vértices ao total");
    }

    static void print(LinkedList[] listas, String numb[]) {
        for (int i = 0; i < numeroVertice; i++) {
            System.out.println(numb[i] + " tem " + listas[i].size() + " vértices adjacentes");
            System.out.println();
        }
    }

    static void complexidade(LinkedList[] listas) {
        int complexidade = 0;
        for (int i = 0; i < numeroVertice; i++) {
            complexidade += listas[i].size() + (listas[i].size() + 1);
        }
        System.out.println("O grafo possui complexidade " + complexidade);
    }
}
