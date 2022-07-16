
public class TesteGerente {

	public static void main(String[] args) {
		
//		Autenticavel gerente = new Gerente();
		
		Gerente g1 = new Gerente();
		
		g1.setNome("Augusto");
		g1.setCpf("111222333-44");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
				
		g1.setSenha(2222);//alterei o dado para 2222
		boolean autenticou = g1.autentica(2222);//recebi o dado e comparei com dado this.senha
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
