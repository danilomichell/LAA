package atividadeslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class GrafoTxt {

    static int numeroVertice = 80000;

    public static void main(String[] args) {
        Scanner in;
        LinkedList[] listas = new LinkedList[numeroVertice];
        int indice = 0;
        ligarListas(listas);
        try {
            in = new Scanner(new FileReader("com-friendster.top5000.cmty.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                listas[0].add(line);
            }
            print(listas);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void ligarListas(LinkedList[] listas) {
        for (int i = 0; i < numeroVertice; i++) {
            listas[i] = new LinkedList();
        }
    }

    static void print(LinkedList[] listas) {
        for (int i = 0; i < numeroVertice; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < listas[i].size(); j++) {
                System.out.print(listas[i].get(j) + " ");
            }
            System.out.println();
        }
    }

}
