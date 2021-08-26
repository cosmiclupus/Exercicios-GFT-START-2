package ex04;

public class Funcionario extends Pessoa {
	
	private float salario_inicial;
	private float percentual;
	private float salario_total;
	
	public Funcionario(String nome, String rg) {
		super(nome, rg);
		
	}

	public float getSalario_inicial() {
		return salario_inicial;
	}

	public void setSalario_inicial(float salario_inicial) {
		this.salario_inicial = salario_inicial;
	}

	public float getPercentual() {
		return percentual;
	}

	public void setPercentual(float percentual, int i) {
		this.percentual = percentual;
	}

	public float getSalario_total() {
		return salario_total;
	}

	public void setSalario_total(float salario_total) {
		this.salario_total = salario_total;
	}
	
	
	

}
