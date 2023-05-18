package br.com.fiap.banco;

public class Conta extends Object { //generalizacao
	
	private String numero;
	private double saldo;
	private String  titularidade;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	public void depositar(double valor) {
		if(valor < 0) System.out.println("Valor Negativo");
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if(saldo < valor) System.out.println("Você não tem saldo para sacar, seu saldo atual é de: "+saldo);
		saldo -= valor;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	

    public void transferencia(double valor) {
    	if(saldo < valor) System.out.println("Voce nao possui saldo para essa transferencia");
    	if(valor < 0) System.out.println("Você não pode fazer transferências com números negativos");
        saldo -= valor;
    }

	public void titularidade(String titularidade) {
		if(titularidade != "Zampar")System.out.println("Você só pode fazer transferência para titularidades iguais");
	}
	

}
