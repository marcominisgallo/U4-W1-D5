public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        if (durata <= 0 || volume <= 0 || luminosita <= 0) {
            throw new IllegalArgumentException("Durata, volume e luminosità devono essere valori positivi.");
        }
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void abbassaVolume() {
        if (volume > 1) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 1) {
            luminosita--;
        }
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    public void esegui() {
        play();
    }
}