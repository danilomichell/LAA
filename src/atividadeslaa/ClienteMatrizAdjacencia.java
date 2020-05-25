package atividadeslaa;

class Aresta {
    int valor;
    Aresta() {
        this.valor = 0;
    }
}

public class ClienteMatrizAdjacencia {

    static int numeroVertices = 12;

    public static void main(String[] args) {
        Aresta[][] matriz = new Aresta[numeroVertices][numeroVertices];

        ligarMatriz(matriz);

        System.out.println("Sem aresta: ");
        print(matriz);

        (matriz[0][1]).valor = 1;
        (matriz[0][5]).valor = 1;
        (matriz[1][0]).valor = 1;
        (matriz[1][5]).valor = 1;
        (matriz[2][4]).valor = 1;
        (matriz[3][1]).valor = 1;
        (matriz[5][3]).valor = 1;

        System.out.println("Com arestas: ");
        print(matriz);

    }

    static void ligarMatriz(Aresta[][] matriz) {
        for (int i = 0; i < numeroVertices; i++) {
            for (int j = 0; j < numeroVertices; j++) {
                matriz[i][j] = new Aresta();
            }
        }
    }

    static void print(Aresta[][] matriz) {
        System.out.println("-  0 1 2 3 4 5 -");
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < numeroVertices; j++) {
                System.out.print(matriz[i][j].valor + " ");
            }
            System.out.println();
        }
    }

}
