package application;

import java.io.BufferedReader;
import java.util.Map;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> map = new HashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);

                if (map.containsKey(name)) {
                    int newCount = map.get(name) + count;
                    map.put(name, newCount);
                } else {
                    map.put(name, count);
                }

                line = br.readLine();
            }
            for (String key : map.keySet()) {
                System.out.println(key + ": " + map.get(key));
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}