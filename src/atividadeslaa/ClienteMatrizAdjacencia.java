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

        (matriz[3][8]).valor = 1;
        (matriz[3][10]).valor = 1;
        (matriz[5][11]).valor = 1;
        (matriz[7][11]).valor = 1;
        (matriz[7][8]).valor = 1;
        (matriz[11][2]).valor = 1;
        (matriz[11][9]).valor = 1;
        (matriz[11][10]).valor = 1;
        (matriz[8][9]).valor = 1;
        
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
        System.out.println("-  0 1 2 3 4 5 6 7 8 9 10 11 -");
        for (int i = 0; i < numeroVertices; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < numeroVertices; j++) {
                System.out.print(matriz[i][j].valor + " ");
            }
            System.out.println();
        }
    }

}
