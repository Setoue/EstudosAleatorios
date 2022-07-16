
public class TestaMetodo {
	public static void main(String[] args) {
		
		Conta contaMinha = new Conta();
		contaMinha.deposita(510);
		System.out.println(contaMinha.saldo);
		
		boolean conseguiuRetirar = contaMinha.saca(20);
		System.out.println(contaMinha.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaJuh = new Conta();
		contaDaJuh.deposita(1000);
		
		if(contaDaJuh.transfere(300, contaMinha)) {
			System.out.println("transferencia feita com sucesso!");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaJuh.saldo);
		System.out.println(contaMinha.saldo);
		
		contaMinha.titular = "Augusto";
		System.out.println(contaMinha.titular);
	}
}
