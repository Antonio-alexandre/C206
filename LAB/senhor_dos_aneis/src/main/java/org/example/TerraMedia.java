package org.example;

public class TerraMedia {
    private Habitante herois[] = new Habitante[10];

    public void addHabitante(Habitante habitante){
        for(int i = 0; i < this.herois.length; i++){
            if(this.herois[i] == null){
                this.herois[i] = habitante;
                break;
            }
        }
    }

    public void listarHabitantes(){
        for (int i = 0; i < this.herois.length; i++)
        {
            if(this.herois[i] != null){
                if(this.herois[i] instanceof Elfo){
                    Elfo elfo = (Elfo) this.herois[i];
                    elfo.viajar();
                    elfo.atacar();
                    elfo.mostraInfo();
                    elfo.curar();
                } else if (this.herois[i] instanceof Anao) {
                    Anao anao = (Anao) this.herois[i];
                    anao.atacar();
                    anao.mostraInfo();
                    anao.minerar();
                }
                else if(this.herois[i] instanceof Mago){
                    Mago mago = (Mago) this.herois[i];
                    mago.atacar();
                    mago.mostraInfo();
                    mago.lancaFeitico();
                }
            }
        }
    }
}
