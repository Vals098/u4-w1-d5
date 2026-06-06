package Player.entities;

public abstract class ElementoMultimediale {

    //    attributi comuni a tutti gli ElementiMultimediali
    protected String titolo;

    //    costruttore di ElementiMultimediali
    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    //getter e setter
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo() {
        this.titolo = titolo;
    }
}


