package exercicio01;

public class Teste {
    public static void main(String[] args) {
        Funcionario a = new Funcionario("Maria","789.987.566.53");
        Funcionario b = new Funcionario("Joaquim","087.344.777.98");
        Gerente f = new Gerente("Rh","Carlos","123.345.456.87");


        System.out.println("Funcionarios: ");
        a.mostrar();
        b.mostrar();
        System.out.println("Gerente: ");
        f.mostrar();

    }
}
