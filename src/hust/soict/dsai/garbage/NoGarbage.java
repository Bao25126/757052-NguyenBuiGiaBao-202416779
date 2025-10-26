package hust.soict.dsai.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("large_text_file.txt"));
        String line;
        StringBuffer sb = new StringBuffer();
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        br.close();
        System.out.println("Length: " + sb.length());
    }
}
