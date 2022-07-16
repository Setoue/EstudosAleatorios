public class Conta {
	private double saldo;//atributo do objeto
	private int agencia;//atributo do objeto
	private int numero;//atributo do objeto
	private Cliente titular;//atributo do objeto
	private static int total;// total pertence a classe conta e n�o do objeto
	//static tem fun��o de vari�vel global para todos os objetos que pertecema classe
	//static quere dizer da classe
	
	public Conta(int agencia, int numero) {//esse � o CONSTRUCTOR e ele pode receber parametros
		// construtor n�o tem retorno, ele � simplemente uma rotina de inicializa��o
		// s� � executado com a palavra chave "new", ele n�o executa mais de uma vez
		// na msm objeto
		Conta.total++;
		///System.out.println("total de contas � "+ Conta.total);
		this.agencia = agencia;// o "this" faz refencia a estancia, n�o sendo static 
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
	
	public void setNumero(int numero){ //modifica o atributo que est� privado
		if(numero <= 0) {
			System.out.println("n�o pode ser negativo");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <=0) {
			System.out.println("n�o pode valor negativo");
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
	// dentro de um contexto static n�o existe "this", n�o pode aceesar um m�todo
	// de estancia com "this", s� podendo acessar atributos static da classe
		
		return Conta.total;
	}
	
}

 