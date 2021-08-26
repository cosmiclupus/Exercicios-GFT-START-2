package ex04;

public class Main {

	public static void main(String[] args) {
		float saltot,salinic,percen;
				Funcionario func = new Funcionario("Joao","1234562");
		
		func.setSalario_inicial(1000);
		func.setPercentual(10,5);
		percen=func.getPercentual();
		salinic = func.getSalario_inicial();
		
		saltot = salinic+salinic*percen;
		
		System.out.printf("func.nome"+" "+"func.rg"+" "+saltot);
		
	
	}

}
