package Banco;

public class ContaPoupanca extends Conta{
	public ContaPoupanca(int numero, String cliente) {
		super(numero, cliente);
	}
	
	@Override
	public boolean sacar(double valor) {
		if(valor<=0) {
			return false;
		}
		if(valor>saldo) {
			return false;
		}
		
		saldo-=valor;
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
}
