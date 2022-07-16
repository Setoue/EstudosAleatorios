
public class TestaCliente {
	
	public static void main(String[] args) {
		Cliente augusto = new Cliente();
		augusto.nome = "Augusto Shigeru";
		augusto.cpf = "999.999.999-9;";
		augusto.profissao = "developer";
		
		Conta contaDoAugusto = new Conta();
		contaDoAugusto.deposita(100);
		
		// associo o cliente a conta
		contaDoAugusto.titular = augusto;
		System.out.println(contaDoAugusto.titular.nome);
		System.out.println(contaDoAugusto.titular);
		System.out.println(augusto);
		
	}
}
