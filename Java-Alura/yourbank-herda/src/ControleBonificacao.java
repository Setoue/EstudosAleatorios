
public class ControleBonificacao {

	private double soma;
	
	public void registra(Funcionario f) {//referencia da class M�e. SEMPRE
//  public void registra(Gerente f) -> n�o funciona pq a referencia n�o � generica
//		                 ---------  referencia;
// para o polimorfismo acontecer a class ser filha de outra class, no caso a class m�e 
		double boni = f.getBonificacao();  //polimorfismo
		// sempre sera utilizado o metodo especifico do objeto referenciado
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return soma;
	}
	
}
