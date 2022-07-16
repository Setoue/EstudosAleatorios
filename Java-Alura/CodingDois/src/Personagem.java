public class Personagem extends Perfil {
    
    private int vida;
    private int inteligencia;
    private int habilidade;
    private int forca; //Força
    private String efeito;
    private boolean ativo;

    //Construtor, não necessariamente precisam ser todos os atributos
  

    public int getVida(){
        return this.vida;
    }

    public int getInteligencia(){
        return this.inteligencia;
    }

    public int getHabilidade(){
        return this.habilidade;
    }

    public int getForca(){
        return this.forca;
    }

    public String getEfeito(){
        return this.efeito;
    }

    public void setEfeito(String efeito){
        this.efeito = efeito;
    }

    public boolean getAtivo(){
        return this.ativo;
    }



}