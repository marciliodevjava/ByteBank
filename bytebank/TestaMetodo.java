package bytebank;

public class TestaMetodo {

	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.numero = 1111;
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(200);
		
		contaDoPaulo.saca(20);
		
		System.out.println(contaDoPaulo.saldo);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(300, contaDoPaulo);
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular = "Paulo Silveira";
		contaDaMarcela.titular = "Marcela Silveira";
		
		System.out.println(contaDoPaulo.titular);
	}
}
