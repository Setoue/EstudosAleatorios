public class Conta {
	private double saldo;//atributo do objeto
	private int agencia;//atributo do objeto
	private int numero;//atributo do objeto
	private Cliente titular;//atributo do objeto
	private static int total;// total pertence a classe conta e não do objeto
	//static tem função de variável global para todos os objetos que pertecema classe
	//static quere dizer da classe
	
	public Conta(int agencia, int numero) {//esse é o CONSTRUCTOR e ele pode receber parametros
		// construtor não tem retorno, ele é simplemente uma rotina de inicialização
		// só é executado com a palavra chave "new", ele não executa mais de uma vez
		// na msm objeto
		Conta.total++;
		///System.out.println("total de contas é "+ Conta.total);
		this.agencia = agencia;// o "this" faz refencia a estancia, não sendo static 
		this.numero = numero;
		//System.out.println("Ainda estou criando algo");
	}
	
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
		if(this.saca(valor)) {
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
		
	}
	
	public int getNumero() { //chama o atributo que esta privado
		return this.numero;
	}
	
	public void setNumero(int numero){ //modifica o atributo que está privado
		if(numero <= 0) {
			System.out.println("não pode ser negativo");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("não pode valor negativo");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
	// dentro de um contexto static não existe "this", não pode aceesar um método
	// de estancia com "this", só podendo acessar atributos static da classe
		
		return Conta.total;
	}
	
}

 