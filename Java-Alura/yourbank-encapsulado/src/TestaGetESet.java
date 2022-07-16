
public class TestaGetESet {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta(100, 30000);
		//conta.numero = 1000;
		//conta.setNumero(1000);
		
		System.out.println(conta.getNumero());
		
		Cliente augusto = new Cliente();
		//conta.titular = augusto;  // não funciona pq o atributo titular é privado
		
		augusto.setNome("Augusto Shigeru");
		conta.setTitular(augusto);
		
		System.out.println(conta.getTitular().getNome());
		// para printar um atributo privado, tem que
		//invocar o metodo geral e especifico
		// pq se for só o metodo 
		//geral "conta.getTitular()" ele imprime o endereço da memória, EX a baixo
		System.out.println(conta.getTitular());
		
		//forma mais simples
		conta.getTitular().setProfissao("programador");
		//aqui ele invoca o metodo que chama o titular e atraves do setTitular
		//ele modifica definindo o parametro para o metodo
		//------------------------------------------------------------
		//forma mais longa de digitar
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta);
		System.out.println(augusto);
		System.out.println(conta.getTitular());
	}
}
