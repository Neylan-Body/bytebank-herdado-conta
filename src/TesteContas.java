
public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(1, 111);
		contaCorrente.deposita(100);
		ContaPoupanca contaPoupanca = new ContaPoupanca(2, 111);
		contaPoupanca.deposita(200);
		
		contaCorrente.transfere(10, contaPoupanca);
		System.out.println("O saldo da conta corrente é "+contaCorrente.getSaldo());
		System.out.println("O saldo da conta poupança é "+contaPoupanca.getSaldo());
	}

}
