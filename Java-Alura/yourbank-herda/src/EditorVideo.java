
public class EditorVideo extends Funcionario{//Editor herda da class Funcionario
//herança
	
	
	public EditorVideo() {
		
	}
	
	public double getBonificacao() {
		//System.out.println("Metodo do Editor de Video");
		return super.getBonificacao() + 100; 
		//"super." significa que o atributo n é desssa classe e sim da class mãe
	}
	
	
	
}
