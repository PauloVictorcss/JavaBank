public class TestaContas {
	
	public static void main(String[] args) {
		
		ContaCorrente CC = new ContaCorrente(456, 465);
		CC.deposita(100.0);
		
		ContaPoupanca CP = new ContaPoupanca(112, 221);
		CP.deposita(200.0);
		
		CC.transfere(10, CP);
		
		System.out.println("Saldo da conta corrente " + CC.getSaldo());
		System.out.println("saldo da conta poupança " + CP.getSaldo());
	}
