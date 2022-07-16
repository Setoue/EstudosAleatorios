
public class Referencia {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente(); 
		
		g1.setNome("Juliene");
		g1.setSalario(5000);
		
		//g1.autentica(2222);//não funciona, pois o tipo da referencia é Funcionario e não Gerente
		
		Funcionario f= new Funcionario(); 
		f.setSalario(2000);
		
		EditorVideo ev = new EditorVideo(); 
		ev.setSalario(3000);
		
		Design d = new Design();
		d.setSalario(4000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f); 
		controle.registra(ev);
		controle.registra(d);
		 
		System.out.println("Gerente: " + g1.getBonificacao());
		System.out.println("Funcionario: " + f.getBonificacao());
		System.out.println("Editor de vídeo: " + ev.getBonificacao());
		System.out.println("Design: " + d.getBonificacao());
		System.out.println("Soma de todos eles: " + controle.getSoma());
		
		
	}

}
