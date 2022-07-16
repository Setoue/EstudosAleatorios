
public class TestaContaSemCliente {
	
	public static void main(String[] args) {
		Conta contaDeJuh = new Conta();
		System.out.println(contaDeJuh.getSaldo());
		
		contaDeJuh.titular = new Cliente();
		contaDeJuh.titular.nome = "Juliene Beatriz"; 
		//o atributo 'titular' da referencia contaDeJuh
		//	recebe a class Cliente, podendo inserir dados.
		
		System.out.println(contaDeJuh.titular.nome);
		System.out.println(contaDeJuh.titular);
	}
}
