
//implements é para implementar uma interface
public class Cliente implements Autenticavel {
//Vc tem que adicionar os metodo concretos
	
	private AutenticacaoUtil autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoUtil(); // chamando a composição, atravé do constructor
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
	
}
