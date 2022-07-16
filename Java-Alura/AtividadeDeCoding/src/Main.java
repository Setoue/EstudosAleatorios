
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Pessoa{
	public String nome;
	public int Idade;
	
	
	public void Anda() {
		System.out.println("Andou");
	}
	public void Comer() {
		System.out.println("Comendo");
	}
	
}

class Camera{
	public double tamanhoLente;
	public double aberturaDaLente;
	
	public void Captura() {
		System.out.println("Tirou foto");
	}
	
	public void Salvar() {
		System.out.println("Salvou");
	}
}

class Aluno{
	public String nome;
	public double nota;
	
	public void Media() {
		System.out.println("media");
	}
	
	public void Estuda() {
		System.out.println("Estudou");
	}
}

class Nadador{
	public String envergadura;
	public double peso;
	
	public void Nada() {
		System.out.println("Nadou");
	}
	public void Pula() {
		System.out.println("Pulou");
	}
}

class Telefone{
	public boolean liga;
	public String mensagem;
	
	public void Ligacao() {	
		System.out.println("Ligou");
}
	public void EnviarMensagem() {
		System.out.println("mensagem enviada");
	}	
}

class Impressora{
	public double quantidadeDeTinta;
	public double quantidadeDePapel;
	
	public void Imprimir() {
		System.out.println("Imprimiu");
}	
	public void Escanear() {
		System.out.println("Escaneou");
	}
}
