package heranca;

public class peixe extends animal{
    private String caracteristica;

    public peixe(String _nome, String _cor, String _ambiente, float _comprimento, float _velocidade_media, int _patas, String _caracteristica) {
        super(_nome, _cor, _ambiente, _comprimento, _velocidade_media, _patas);
        this.caracteristica = _caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }
    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }

    public void dadosPeixe(){
        dados();
        System.out.println("Caracteristica: " + caracteristica);
    }
}
