package br.com.fiap.banco;

public class App {
	
	public static void main(String[] args) {
				
		Conta conta = new Conta("00123-5");
		conta.depositar(25);
		conta.sacar(30);
		conta.transferencia(5);
		conta.titularidade("Zampar");
		
		
		ContaPoupanca poupanca = new ContaPoupanca("00321-5");
		poupanca.depositar(200);
		poupanca.getNumero();
		
		poupanca.sacar(2);
		
		
	}

}
