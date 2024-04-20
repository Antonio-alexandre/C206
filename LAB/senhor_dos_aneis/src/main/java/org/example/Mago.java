package org.example;

import org.example.Interfaces.Cura;
import org.example.Interfaces.Feitico;

public class Mago extends Habitante implements Cura, Feitico {
    private String cor;

    public void setCor(String cor){
        this.cor = cor;
    }

    public void atacar(){
        System.out.println();
        System.out.println("Mago atacando!");
        super.atacar();
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Cor: "+this.cor);
    }

    @Override
    public void curar(){
        float energia = this.getEnergia();
        energia += energia * 0.15;
        this.setEnergia(energia);

        System.out.println();
        System.out.println("Mago curou!");
        System.out.println("Energia: "+this.getEnergia());
    }

    @Override
    public void lancaFeitico(){
        float energia = this.getEnergia();
        energia -= energia * 0.10;
        this.setEnergia(energia);

        System.out.println();
        System.out.println("Mago fazendo feitiço!");
        System.out.println("Energia: "+this.getEnergia());
    }
}
