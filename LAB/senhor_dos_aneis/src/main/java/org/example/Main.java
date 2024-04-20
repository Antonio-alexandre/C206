package org.example;

public class Main {
    public static void main(String[] args) {
        TerraMedia terra = new TerraMedia();

        //Definicao das armas
        Arma arma1 = new Arma();
        arma1.setNomeArma("Glamdring");
        arma1.setMagica(true);

        Arma arma2 = new Arma();
        arma2.setNomeArma("Martelo");
        arma2.setMagica(false);

        Arma arma3 = new Arma();
        arma3.setNomeArma("Arco");
        arma3.setMagica(false);

        Arma arma4 = new Arma();
        arma4.setNomeArma("Andúril");
        arma4.setMagica(true);

        Arma arma5 = new Arma();
        arma5.setNomeArma("Anglachel");
        arma4.setMagica(true);

        //Definicao dos habitantes
        Anao anao1 = new Anao();
        anao1.setNome("Gimli");
        anao1.setEnergia(100);
        anao1.setAlturaAnao(1.20f);
        anao1.setIdade(300);
        anao1.setReino("Arda");
        anao1.arma = arma2;

        Anao anao2 = new Anao();
        anao2.setNome("Thorin II");
        anao2.setEnergia(300);
        anao2.setAlturaAnao(1.25f);
        anao2.setIdade(400);
        anao2.setReino("Arda");
        anao2.arma = arma4;

        Elfo elfo1 = new Elfo();
        elfo1.setNome("Legolas");
        elfo1.setEnergia(500);
        elfo1.setIdade(250);
        elfo1.setTribo("Aman");
        elfo1.arma = arma3;

        Elfo elfo2 = new Elfo();
        elfo2.setNome("Eöl");
        elfo2.setEnergia(600);
        elfo2.setIdade(250);
        elfo2.setTribo("Aman");
        elfo2.arma = arma5;

        Mago mago1 = new Mago();
        mago1.setNome("Gandalf");
        mago1.setEnergia(1000);
        mago1.setIdade(1200);
        mago1.setCor("Cinza");
        mago1.arma = arma1;

        //Adicionando os habitantes no array
        terra.addHabitante(anao1);
        terra.addHabitante(anao2);
        terra.addHabitante(elfo1);
        terra.addHabitante(elfo2);
        terra.addHabitante(mago1);

        //Listando os habitantes do array
        terra.listarHabitantes();
    }
}