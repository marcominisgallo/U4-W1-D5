public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        if (luminosita <= 0) {
            throw new IllegalArgumentException("La luminosità deve essere un valore positivo.");
        }
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 1) {
            luminosita--;
        }
    }

    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminosita));
    }

    @Override
    public void esegui() {
        show();
    }
}