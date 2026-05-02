public class Desenvolvedor extends Funcionario{
    private int horasExtras;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras){
        super(nome,salarioBase);
        this.horasExtras = horasExtras;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtras * 50);
    }
}
