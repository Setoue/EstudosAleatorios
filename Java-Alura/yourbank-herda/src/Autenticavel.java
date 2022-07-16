
//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autenica

public abstract interface Autenticavel {
	//class abstrata, sendo intermediaria, ficando entre a class mãe e as class filhas
	//
	//METODOS ABSTRADOS NÃO POSSUEM IMPLEMENTAÇÕES
	//UMA INTERFACE É UMA CLASS ABSTRATA COM TODOS OS METODOS ABSTRATOS
	//NÃO PODE TER NADA CONCRETO, APENAS A ASSINATURA DOS METODOS ABSTRATOS
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

	
}
