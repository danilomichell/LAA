package atividadeslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Arestas {

    int valor;

    Arestas() {
        this.valor = 0;
    }
}

public class ProvaLAAQ3 {

    static String caminho = "File1.txt";

    public static void main(String[] args) throws FileNotFoundException {
        int vertices = numeroVertices();
        Arestas[][] matriz = new Arestas[vertices][vertices];
        ligarMatriz(matriz, vertices);
        (matriz[0][1]).valor = 1;
        (matriz[0][2]).valor = 1;
        (matriz[0][3]).valor = 1;
        (matriz[1][0]).valor = 1;
        (matriz[1][2]).valor = 1;
        (matriz[2][3]).valor = 1;
        (matriz[2][4]).valor = 1;
        (matriz[3][4]).valor = 1;

        print(matriz, vertices);
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

    static void ligarMatriz(Arestas[][] matriz, int numeroVertices) {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                matriz[i][j] = new Arestas();
            }
        }
    }

    static void print(Arestas[][] matriz, int numeroVertices) {
        int count = 1025;
        System.out.println("\t1025 \t1026 \t1027 \t1028 \t1029");
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print(count + ":\t");
            count++;
            for (int j = 0; j < numeroVertices; j++) {
                System.out.print(matriz[i][j].valor + "\t");
            }
            System.out.println();
        }
    }
}
