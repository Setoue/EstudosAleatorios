
public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc =  new ContaCorrente(2222, 1231231);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
	
		CalculadorDeImposto imposto = new CalculadorDeImposto();
		imposto.registra(cc);
		imposto.registra(seguro);
		
		System.out.println(imposto.getTotalImposto());
		
	
	}

}
