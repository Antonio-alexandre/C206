package org.example;

import org.example.Interfaces.Cura;

public class Elfo extends Habitante implements Cura {
    private String tribo;

    public void viajar(){
        System.out.println();
        System.out.println("Elfo viajou!");
    }

    public void atacar(){
        System.out.println();
        System.out.println("Elfo atacou!");
        super.atacar();
    }

    public void curar(){
        float energia = this.getEnergia();
        energia += energia * 0.15;
        this.setEnergia(energia);

        System.out.println();
        System.out.println("Elfo curou!");
        System.out.println("Energia: " +this.getEnergia());
    }

    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Tribo do elfo: " +this.tribo);
    }

    public void setTribo(String tribo) {
        this.tribo = tribo;
    }
}
