
public class Administrador extends Funcionario implements Autenticavel {
		
	private AutenticacaoUtil autenticador;
	
	public Administrador() {
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
}
