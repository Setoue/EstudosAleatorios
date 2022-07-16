
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f) {//referencia da class Mãe. SEMPRE
//  public void registra(Gerente f) -> não funciona pq a referencia não é generica
//		                 ---------  referencia;
// para o polimorfismo acontecer a class ser filha de outra class, no caso a class mãe 
		double boni = f.getBonificacao();  //polimorfismo
		// sempre sera utilizado o metodo especifico do objeto referenciado
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
