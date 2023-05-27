package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Quantos funcionários serão registrados? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Funcionário #" + i);
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.println();
        System.out.print("Digite o Id do funcionário que deseja aumentar o salário: ");
        int id = sc.nextInt();
        Funcionario func = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        
        System.out.print("Digite a porcentagem: ");
        double porcentagem = sc.nextDouble();
        func.increaseSalary(porcentagem);

        System.out.println();
        System.out.println("Lista de funcionários: ");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario);
        }
        
        sc.close();
    }
}
