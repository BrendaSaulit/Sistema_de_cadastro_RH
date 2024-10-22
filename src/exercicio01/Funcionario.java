package exercicio01;

public class Funcionario {
    private String nome;
    private String cpf;
    private final double salario = 3500;
    public Funcionario(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return this.salario;
    }

    public void mostrar() {
        System.out.println("Nome = " + getNome());
        System.out.println("CPF = " + getCpf());
        System.out.println("Salario = " + getSalario());
        System.out.println();
    }
}
