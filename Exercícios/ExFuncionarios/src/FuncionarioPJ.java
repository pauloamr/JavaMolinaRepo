
public class FuncionarioPJ extends Funcionario {
	public FuncionarioPJ(String nome, double salarioBase) {
		super(nome, salarioBase);
	}
	
	public double calcularSalario(){
		return getSalarioBase();
	}
}
