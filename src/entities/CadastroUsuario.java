package entities;

public class CadastroUsuario extends Banco {
	//-----atributos
	
	private String nome;
	private int telefone;
	private int cpf;
	private int numeroConta;
	private int conta;
	private double valor;

	//-----------------constructor-------------------------------


	public CadastroUsuario( int numeroConta, int Nconta,String titular,double valor) {
		super( numeroConta,Nconta, titular,valor);
		this.numeroConta = numeroConta;
		this.conta = Nconta;
		this.nome = titular;
		this.valor = valor;
		

		
	}
	
	
	
	


	
	public CadastroUsuario(int numeroConta, int Nconta, String titular) {
		super( numeroConta,Nconta, titular);
		this.numeroConta = numeroConta;
		this.conta = Nconta;
		this.nome = titular;
		
	}







	public void CadastroUsuario(String nome, int telefone,int cpf) {
		
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		
		
		}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getNumeroConta(int numeroConta) {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getConta(int Conta) {
		return Conta;
	}

	public void setConta(int Conta) {
		this.conta = Conta;
	}
	
	
	public String toString() {
		return "Nome: "+nome+
			   " numeroConta: "+getNumeroConta(numeroConta)+
				" Conta: "+getConta(conta)+
				"  saldo:$ "+getSaldo();
	}
	

}
