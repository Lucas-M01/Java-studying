package application;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Program {
    public static void main(String[] args) {
        File inputFile = new File("test.csv");
        
        try (Scanner scanner = new Scanner(inputFile)) {

            File outputFolder = new File("out");

            if(!outputFolder.exists()) {
                outputFolder.mkdir();
            }
            File outputFile = new File(outputFolder, "summary.csv");
            FileWriter writer = new FileWriter(outputFile);

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                String[] partes = linha.split(",");

                String nomeProduto = partes[0];
                double preco = Double.parseDouble(partes[1]);
                int quantidade = Integer.parseInt(partes[2]);

        
                String linhaResumida = nomeProduto + ", " + preco*quantidade;
                writer.write(linhaResumida + "\n");
            }

            writer.close();

            System.out.println("Arquivo 'summary' criado com sucesso!");

            File summaryFile = new File(outputFolder, "summary.csv");
            try (Scanner summaryScanner = new Scanner(summaryFile)) {
                System.out.println("Conteúdo do arquivo 'summary':");
                while (summaryScanner.hasNextLine()) {
                    String linhaResumida = summaryScanner.nextLine();
                    System.out.println(linhaResumida);
                }
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo 'summary': " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }       
    
}
