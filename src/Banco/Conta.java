package Banco;

public abstract class Conta {
	int numero;
	String cliente;
	double saldo; 
	
	public Conta(int numero, String cliente){
		this.numero=numero;
		this.cliente=cliente;
		this.saldo=0.0;
	}
	
	public void depositar(double valor) {
		if(valor<=0) {
			System.out.println("Valor de deposito deve ser maior que zero.");
		}
		else {
			this.saldo+=valor;
			System.out.println("Deposito realizado com sucesso! Novo saldo: R$ " + this.saldo);
		}
	}
	
	public abstract boolean sacar(double valor);
	
	public abstract boolean transferir(double valor,Conta destino);
	
	
	
}
