package hust.soict.dsai.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("large_text_file.txt"));
        String line;
        String s = "";
        while ((line = br.readLine()) != null) {
            s += line; // creates lots of temporary Strings
        }
        br.close();
        System.out.println("Length: " + s.length());
    }
}
