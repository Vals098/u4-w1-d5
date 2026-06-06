package Player.entities;

public abstract class ElementoMultimediale {

    //    attributi comuni a tutti gli ElementiMultimediali
    protected String title;

    //    costruttore di ElementiMultimediali
    public ElementoMultimediale(String title) {
        this.title = title;
    }


    //getter e setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    //    metodi comuni
    public abstract void esegui();
}


