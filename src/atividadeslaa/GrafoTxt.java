package atividadeslaa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class GrafoTxt {

    public static void main(String[] args) {
        Scanner in;
        try {
            in = new Scanner(new FileReader("com-friendster.top5000.cmty.txt"));
            while (in.hasNextLine()) {                
                String line = in.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
