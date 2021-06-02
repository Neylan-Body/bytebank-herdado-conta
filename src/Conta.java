
public abstract class Conta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular; 
	private static int total;
	
	public Conta(int agencia, int numero) {
		setAgencia(agencia);
		setNumero(numero);
		Conta.total++;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public int getAgencia() {
		return agencia;
	}
	private void setAgencia(int agencia) {
		if(agencia>0) {
			this.agencia = agencia;
		}else {
			System.out.println("O Numero da agencia não pode ser negativo");
		}
	}
	public int getNumero() {
		return numero;
	}
	private void setNumero(int numero) {
		if(numero>0) {
			this.numero = numero;
		}else {
			System.out.println("O Numero da conta não pode ser negativo");
		}
	}
	
	public abstract void deposita(double valor);
	public boolean transfere(double valor, Conta destino) {
		if(!(this.saldo<valor)) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		
	}
	public boolean saca(double valor) {
		if(!(this.saldo<valor)) {
			this.saldo -= valor;
			return true;
		}
		return false;
	}

	public static int getTotal() {
		return Conta.total;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
}