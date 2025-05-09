public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile {
    private int durata; // in secondi
    private int volume; // livello del volume

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        if (durata <= 0 || volume <= 0) {
            throw new IllegalArgumentException("Durata e volume devono essere valori positivi.");
        }
        this.durata = durata;
        this.volume = volume;
    }

    public void abbassaVolume() {
        if (volume > 1) {
            volume--;
        }
    }

    public void alzaVolume() {
        volume++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + " " + "!".repeat(volume));
        }
    }
}
