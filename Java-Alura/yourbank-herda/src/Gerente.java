
public class Gerente extends Funcionario implements Autenticavel{
	//Gerente herda da class Funcionario e tbm é uma Autenticavel
//herança
	//Pode fazer herança e interface na mesma class
	
	
	
	public double getBonificacao() {
		//System.out.println("Metodo do Gerente");
		return super.getBonificacao() + super.getSalario(); 
		//"super." significa que o atributo n é desssa classe e sim da class mãe
	}

	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	//chama o metodo setSenha para alterar a senha e Guardando a senha o util
	
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
		//chama o metodo autentica e guarda o valor de senha em util.
	}
	
	//HERANÇA MULTIPLA NÃO EXISTE NO JAVA. O PROBLEMA SE RESOLVE ATRAVÉS DE INTERFACES
	
}
