public class Main {
    public static void main(String[] args) {
        Funcionario[] funcionarios ={
                new Gerente ("Calebe", 4500, 3000),
                new Desenvolvedor("Arthur", 3500, 12),
                new Desenvolvedor("Cauê", 3500, 15)
        };

        for (Funcionario f : funcionarios){
            f.imprime();
        }
    }
}
