package entities;

public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario (Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return this.id;
    }

    public  String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return this.salario;
    }

    public void increaseSalary(Double percentual) {
        this.salario += this.salario * (percentual / 100.0);
    }

    // Create a method toString()
    public String toString() {
        return id
            + ", "
            + nome
            + ", "
            + String.format("%.2f", salario);
    }
}
