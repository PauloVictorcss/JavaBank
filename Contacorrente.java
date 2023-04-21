
public class ContaCorrente extends Conta {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double ValoraSacar = valor + 0.2;
		return super.saca(ValoraSacar);
	}
	@Override
	public void deposita(double valor) {
		super.getSaldo() += valor;
	}
	

}
