package heranca;

public class mamifero extends animal{

    private String alimento;

    public mamifero(String _nome, String _cor, String _ambiente, float _comprimento, float _velocidade_media, int _patas, String _alimento) {
        super(_nome, _cor, _ambiente, _comprimento, _velocidade_media, _patas);
        this.alimento = _alimento;
    }

    public String getAlimento() {
        return alimento;
    }
    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public void dadosMamiferos(){
        dados();
        System.out.println("Alimento: " + alimento);
    }
}
