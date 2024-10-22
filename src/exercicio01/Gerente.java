package exercicio01;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String departamento, String nome, String cpf) {
        super(nome, cpf);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    @Override
    public double getSalario(){
        return 1.2 * super.getSalario();
    }
    @Override
    public void mostrar() {
        System.out.println("Nome = " + getNome());
        System.out.println("CPF = " + getCpf());
        System.out.println("Salario = " + getSalario());
        System.out.println("Departamento = " + getDepartamento());
    }
}

/*@Override
    public double getSalario() {
        int porcentagem = (120 / 100);
        return porcentagem * getSalario();
    }*/