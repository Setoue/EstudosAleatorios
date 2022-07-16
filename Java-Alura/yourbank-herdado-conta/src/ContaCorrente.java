
public class ContaCorrente extends Conta implements Tributavel{

	 public ContaCorrente(int agencia, int numero) {
		 // para utilizar o construtor m�e, vc passa os parametros da m�e para filha
		 // passando o construtor especifico e n�o o padr�o
		 // os parametros tem q ser todos os da m�e
		 super(agencia, numero);//chamando construtor especificos
	 }
	 
	 @Override 
	 public boolean saca(double valor) {//reescrita do metodo | tem ser tudo igual
	 // o metodo � o mesmo da Classe conta, porem est� sendo sobrescrito 
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
		//ele recebe todas as funcionalidades do metodo sacar. Sobre escreve com
		//mais funcionalidade e retorna ela;
	}

	@Override
	public double getValorImposto() {
		return super.getSaldo() * 0.1;
	}
}
