public class Pessoa {
    
    //Atributos de classe
	private float pesoAtual;
	private float pesoAnterior;
    private String nome;
    private float idade;
    private float altura;
    private String sexo;
    private float media;

    public Pessoa() {}
    
    //Construtor da classe pessoa
    public Pessoa (float pesoAtual, float pesoAnterior, String nome, float idade, float altura, String sexo) {
        this.pesoAtual = pesoAtual;
        this.pesoAnterior = pesoAnterior;
    	this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.sexo = sexo;
    }
    
    //Metodo set atribui valor.
    public void setPesoAtual(float pesoAtual) {
        this.pesoAtual = pesoAtual;
    }
    //Metodo get recupera atributo
    public float getPesoAtual() {
        return this.pesoAtual;
    }
    
    public void setPesoAnterior(float pesoAnterior) {
        this.pesoAnterior = pesoAnterior;
    }
    public float getPesoAnterior() {
        return this.pesoAnterior;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getIdade() {
        return this.idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getSexo() {
        return this.sexo;
    }
    //Metodo set atribui valor.
    public void setMedia(float Media) {
        this.media = media;
    }
    //Metodo get recupera atributo
    public float getMedia() {
    	float soma = this.pesoAtual + this.pesoAnterior; 
        return soma/2;    
    }
}
