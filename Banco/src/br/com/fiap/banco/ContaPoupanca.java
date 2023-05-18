package br.com.fiap.banco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(String numero) {
		super(numero);
	}

	private double taxa;

	public double getTaxa() {
		return taxa;
	}
	
    @Override
    public void sacar(double valor) {
        System.out.println("Não é possível realizar saques em conta poupança");
    }

}
