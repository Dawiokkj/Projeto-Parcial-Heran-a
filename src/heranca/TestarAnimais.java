package heranca;

public class TestarAnimais {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("#####################################################");

        animal Camelo = new animal("Camelo", "Amarelo", "Terra", 150f, 2F, 4);
        Camelo.dados();

        System.out.println("#####################################################");
        System.out.println();
        System.out.println("#####################################################");

        peixe tubarao = new peixe("Tubarão", "Cinzento", "Mar", 300f, 1.5f, 0, "Barbatanas e cauda");
        tubarao.dadosPeixe();

        System.out.println("#####################################################");
        System.out.println();
        System.out.println("#####################################################");

        mamifero urso = new mamifero("Urso do Canada", "Vermelho", "Terra", 180f, 0.5f, 4, "Mel");
        urso.dadosMamiferos();

        System.out.println("#####################################################");
        System.out.println();

    }
}
