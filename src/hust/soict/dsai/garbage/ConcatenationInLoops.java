package hust.soict.dsai.garbage;

public class ConcatenationInLoops {
    public static void main(String[] args) {
        int n = 100000;
        long start, elapsed;

        start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        elapsed = System.currentTimeMillis() - start;
        System.out.println("String (+): " + elapsed + " ms");

        start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) sb.append("a");
        elapsed = System.currentTimeMillis() - start;
        System.out.println("StringBuffer: " + elapsed + " ms");

        start = System.currentTimeMillis();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < n; i++) sb2.append("a");
        elapsed = System.currentTimeMillis() - start;
        System.out.println("StringBuilder: " + elapsed + " ms");
    }
}
