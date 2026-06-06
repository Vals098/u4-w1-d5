package Player.interfaces;


public interface Playable {

    int getDurata();

    int getVolume();

    String getTitolo();

    default void play() {
//        ripete un numero di volte = alla durata la stampa del titolo concatenato a
//        una sequenza di punti esclamativi di lunghezza pari al volume
        for (int i = 0; i < getDurata(); i++) {

            String puntiEsclamativi = "";

            for (int j = 0; j < getVolume(); j++) {
                puntiEsclamativi += "!";
            }

            System.out.println(getTitolo() + puntiEsclamativi);
        }
    }
}

