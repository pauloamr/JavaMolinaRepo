
public class FuncionarioComissionado extends Funcionario{
	private double comissao;
	
	public FuncionarioComissionado(String nome, double salarioBase, double comissao){
		super(nome, salarioBase);
		this.comissao = comissao;
	}
	
	public double calcularSalario(){
		return getSalarioBase() + comissao;
	}
}
