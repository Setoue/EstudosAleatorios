public class Conta {
	double saldo;
	int agencia;
	int numero;
	String titular;// = new Cliente(); //toda vez que criar uma conta ele cria um cliente
	
	public void deposita(double valor) { 
	//metodo 'deposita' retorna nada e recebe 'valor' do tipo double
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		
		if (this.saldo  >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false; 
		}
		
	}
	
	public boolean transfere(double valor, Conta destino) {
		//sempre que for retorna um valor, pode definir como boolean
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
}

 