public class Immagine extends ElementoMultimediale {
    public Immagine(String titolo) {
        super(titolo);
    }

    public void mostra() {
        System.out.println("Mostrando immagine: " + titolo);
    }
}