
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta = new Conta(100, 30000); //precisa passar os argumentos de acordo
		// com os paremetros
		// parentese sem esta passando por um contrutor
		// que em sua maioria retorna 0 ou null.
		
		// conta está inconsistente
		//conta.setAgencia(-90);
		//conta.setNumero(-899);
		
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta(100, 44444);
		
		System.out.println(conta2.getAgencia());
		System.out.println(conta2.getNumero());
		
		Conta conta3 = new Conta(100, 55555);
		
		System.out.println(conta3.getAgencia());
		System.out.println(conta3.getNumero());
		
		System.out.println(Conta.getTotal()); //invocando métodos static
	}
}

// atributo imutável: nasce com um valor e morre com ele, sem ser alterado

//CTRL + O : mostra o outline que mostra os métodos e atributos existentes