
public class Principal {
	public static void main(String[] args) {
		Funcionario f1 = new FuncionarioCLT("Paulo", 3000);
		Funcionario f2 = new FuncionarioPJ("José", 4000);
		Funcionario f3 = new FuncionarioComissionado("Lucas", 2000, 500);
		
		System.out.printf("%s - Salário: R$ %.1f%n", f1.getNome(), f1.calcularSalario());
		System.out.println(f2.getNome() + "Salário: " + f2.calcularSalario());
		System.out.println(f3.getNome() + "Salário: " + f3.calcularSalario());

	}

}
