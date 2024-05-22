package heranca;

public class animal{
    private String nome, cor, ambiente;
    private float comprimento, velocidade_media;
    private int patas;

    public animal(String _nome, String _cor, String _ambiente, float _comprimento, float _velocidade_media, int _patas){
        this.nome = _nome; this.cor = _cor; this.ambiente = _ambiente;
        this.comprimento = _comprimento; this.velocidade_media = _velocidade_media;
        this.patas = _patas;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public float getComprimento(){
        return comprimento;
    }
    public void setComprimento(float comprimento){
        this.comprimento = comprimento;
    }

    public String getAmbiente(){
        return ambiente;
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    public int getPatas(){
        return patas;
    }
    public void setPatas(int patas){
        this.patas = patas;
    }

    public void dados(){
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento + " cm");
        System.out.println("Patas: " + patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade Media: " + velocidade_media + " m/s");
    }
}