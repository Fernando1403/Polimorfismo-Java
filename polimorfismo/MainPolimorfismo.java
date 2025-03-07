package br.com.polimorfismo;

public class MainPolimorfismo {

	public static void main(String[] args) {
		
		Veiculo veiculo = new Carro();
		veiculo.acelerar();
		
		Veiculo veiculo1 = new Caminhao();
		veiculo1.acelerar();
		
		Veiculo veiculo2 = new Carro();
		veiculo2.acelerar();
		
		MainPolimorfismo polimorfismo = new MainPolimorfismo();
		
		Pessoa p = polimorfismo.definirIdade(60);
		p.correr();
		
	}
	
	public Pessoa definirIdade(int idade) {
		if (idade > 60) {
			return new Vovozinha();
		}else {
			return new Atleta();
		}
	}
}
