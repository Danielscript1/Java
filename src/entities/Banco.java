package entities;

public class Banco {
	// -----atributos------
	private String Titular;
	private int Conta;
	private int numeroConta;
	private double saldo;
	private double valor;
	// ----constructor----//


	public Banco( int numeroConta, int Conta,String titular, double valor) {
		
		this.numeroConta = numeroConta;
		this.Conta = Conta;
		this.Titular = titular;
		this.saldo = valor;

	}
public Banco( int numeroConta, int Conta,String titular) {
		
		this.numeroConta = numeroConta;
		this.Conta = Conta;
		this.Titular = titular;
		

	}
	

	// -----Gettes settes---
	public String getTitular() {
		return Titular;
	}

	public void setTitular(String titular) {
		Titular = titular;
	}

	public int getConta(int Conta) {
		return Conta;
	}

	public void setConta(int conta) {
		Conta = conta;
	}

	public int getNumeroConta(int numeroConta ) {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// ---metodos---
	
	
	public double Depositar(double valor) {

		this.saldo =+ valor;

		return saldo;
	}

	public double Sacar(double valor) {
		if (saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("saldo insuficiente: $" + saldo);
		}

		return saldo - 5;

	}

	public double Saldo(double saldo) {
		return saldo;
	}
	
}
