
//contrato Autenticavel
	//quem assina esse contrato, precisa implementar
		//metodo setSenha
		//metodo autenica

public abstract interface Autenticavel {
	//class abstrata, sendo intermediaria, ficando entre a class m�e e as class filhas
	//
	//METODOS ABSTRADOS N�O POSSUEM IMPLEMENTA��ES
	//UMA INTERFACE � UMA CLASS ABSTRATA COM TODOS OS METODOS ABSTRATOS
	//N�O PODE TER NADA CONCRETO, APENAS A ASSINATURA DOS METODOS ABSTRATOS
	
	public abstract void setSenha(int senha);
	
	public abstract boolean autentica(int senha);

	
}
