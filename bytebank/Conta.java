package bytebank;

public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;
	String cpf;
	String profissão;
	

	public void deposita(double valor) {
		this.saldo = this.saldo + valor;
	}

	public boolean saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque realizado!");
			return true;
		} else {
			System.out.println("Saldo insuficiente.");
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}
