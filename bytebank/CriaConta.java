package bytebank;

public class CriaConta {

	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.titular = "Marcilio Zanatta Bezerra da Silva";
		primeiraConta.agencia = 1606;
		primeiraConta.numero = 621234;
		primeiraConta.saldo = 200;

		Conta segundaConta = new Conta();
		segundaConta.titular = "Alessandra Luiza";
		segundaConta.agencia = 1606;
		segundaConta.numero = 621235;
		segundaConta.saldo = 500;

		Conta terceiraConta = new Conta();
		terceiraConta.titular = "Isabela Manuela";
		terceiraConta.agencia = 1606;
		terceiraConta.numero = 621236;
		terceiraConta.saldo = 600;

		primeiraConta.saldo += 100;

		System.out.println("========================================");
		System.out.println("Nome: " + primeiraConta.titular);
		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("Numero: " + primeiraConta.numero);
		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("========================================");
		System.out.println("Nome: " + segundaConta.titular);
		System.out.println("Agencia: " + segundaConta.agencia);
		System.out.println("Numero: " + segundaConta.numero);
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("========================================");		
		System.out.println("Nome: " + terceiraConta.titular);
		System.out.println("Agencia: " + terceiraConta.agencia);
		System.out.println("Numero: " + terceiraConta.numero);
		System.out.println("Saldo: " + terceiraConta.saldo);
		System.out.println("========================================");
		
		if(primeiraConta == segundaConta) {
			System.out.println("Mesma conta!");
		} else {
			System.out.println("Contas diferentes");
		}
		System.out.println(primeiraConta.titular);
		System.out.println(segundaConta.titular);

	}
}
