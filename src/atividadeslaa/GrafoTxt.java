package atividadeslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class GrafoTxt {

    static int numeroVertice = 5000;

    public static void main(String[] args) {
        Scanner in;
        LinkedList[] listas = new LinkedList[numeroVertice];
        String[] numb = new String[5000];
        int indice = 0;
        ligarListas(listas);
        try {
            in = new Scanner(new FileReader("com-friendster.top5000.cmty.txt"));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String array[] = line.split("\t");
                numb[indice] = array[0];
                for (int i = 1; i < array.length; i++) {
                    listas[indice].add(array[i]);
                }
                indice++;   
            }
            print(listas, numb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static void ligarListas(LinkedList[] listas) {
        for (int i = 0; i < numeroVertice; i++) {
            listas[i] = new LinkedList();
        }
    }

    static void print(LinkedList[] listas, String numb[]) {
        for (int i = 0; i < numeroVertice; i++) {
            System.out.print(numb[i] + ": ");
            for (int j = 0; j < listas[i].size(); j++) {
                System.out.print(listas[i].get(j) + " ");
            }
            System.out.println();
        }
    }

}
