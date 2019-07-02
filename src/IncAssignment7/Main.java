package IncAssignment7;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String filename = args[0];
        Map<Character, Integer> dict = new HashMap<>();
        FileReader fr = new FileReader(filename);
        int ch;
        while ((ch = fr.read()) != -1) {
            char c = (char) ch;
            if (dict.containsKey(c))
                dict.put(c, dict.get(c) + 1);
            else
                dict.put(c, 1);
        }
        FileWriter fw = new FileWriter("result.txt");
        for (Map.Entry<Character, Integer> entry : dict.entrySet()) {
            fw.write(entry.getKey() + " " + entry.getValue() + "\n");
        }
        fw.close();
    }
}
