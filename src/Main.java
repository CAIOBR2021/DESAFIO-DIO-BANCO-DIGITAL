
public class Main {
	public static void main(String[] args) {
		
		Cliente titular = new Cliente();
		titular.setNome("Fulano");
		
		Conta cc = new ContaCorrente(titular);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(titular);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
