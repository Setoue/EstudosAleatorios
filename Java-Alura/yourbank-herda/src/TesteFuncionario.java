
public class TesteFuncionario {

	public static void main(String[] args) {
		
		
		Funcionario augusto = new Funcionario();
		
		augusto.setNome("Augusto Shigeru");
		augusto.setCpf("111222333-44");
		augusto.setSalario(1000);
		
		System.out.println(augusto.getNome());
		System.out.println(augusto.getBonificacao() + augusto.getSalario());
		

	}

}
 