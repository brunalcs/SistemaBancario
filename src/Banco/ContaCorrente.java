package Banco;

public class ContaCorrente extends Conta implements ITributavel{
	double taxa_saque=0.05;
	double tributo = 0.01;
	
	
	public ContaCorrente(int numero, String cliente) {
		super(numero,cliente);
	}
	
	@Override 
	public boolean sacar(double valor) {
		if(valor<=0) {
			return false;
		}
		
		double taxa = valor*taxa_saque;
		double total = valor+taxa;
		
		if(total>saldo) {
			return false;
		}
		
		saldo-=total; //retirando do total
		return true;
	}
	
	@Override
	public boolean transferir(double valor, Conta destino) {
		if(valor<=0) {
			return false;
		}
		if(!sacar(valor)) {
			return false;
		}
		destino.depositar(valor);
		return true;
	}
	
	@Override
	public double calcularTributos() {
		return saldo*tributo;
	}
}
