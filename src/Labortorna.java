import java.io.*;
import java.util.Scanner;
import java.lang.String;
import java.util.ArrayList;

public class Labortorna {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            File file = new File("premier_league1.csv");
            br = new BufferedReader(new FileReader(file));
            String line;
            String line_first;
            line_first = br.readLine();
            int k = Integer.parseInt(String.valueOf(line_first));
            while (k > 0) {
                line = br.readLine();
                ArrayList<Integer> arrayList = new ArrayList<>();
                char[] ch = line.toCharArray();
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isDigit(ch[i])) {
                        int a = Integer.parseInt(String.valueOf(ch[i]));
                        arrayList.add(a);
                    }
                }
                System.out.println(arrayList);
                k--;
            }
        } catch (IOException e) {
            System.out.print("Error: " + e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                {
                    System.out.println("Error: " + e);
                }
            }
        }
    }
}
